/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linguist.control;

import com.Linguist.model.imageUpload;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author User
 */
@WebServlet(name = "UploadServlet", urlPatterns = {"/UploadServlet"})
@MultipartConfig
public class UploadServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        /*  if (!ServletFileUpload.isMultipartContent(request)) {
         System.out.println("Nothing to upload ");
         return;
         }

         FileItemFactory factory = new DiskFileItemFactory();
         ServletFileUpload upload = new ServletFileUpload(factory);

         try {
         List<FileItem> items = upload.parseRequest(request);
         for (FileItem item : items) {
         File uploadDir = new File("F:\\image");
         File file = File.createTempFile("img", ".jpg", uploadDir);
         item.write(file);
         System.out.println("upload  successfull");
         }

         } catch (FileUploadException ex) {
         System.out.println("upload not successfull");
         } catch (Exception ex) {
         Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
         }*/
        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        /* Part partImage = request.getPart("upldImge");
         String destination = "C:\\Users\\User\\Documents\\NetBeansProjects\\Linguist";
         String extension = "jpg";
         imageUpload upload = new imageUpload();
         boolean flag = upload.uploadImage(partImage);
         if (flag == true) {
         System.out.print("successfull");
         }
         getServletContext().getRequestDispatcher("imageView.jsp").forward(request, response);*/
        /**
         *
         * last method
         *
         */
        Part uploadedImage = request.getPart("image");
        String filename = uploadedImage.getSubmittedFileName();

        out.println(filename);
        InputStream filecontent = uploadedImage.getInputStream();
        imageUpload image = new imageUpload();
        String extnsn = image.getExtensn(filename);
        out.println(extnsn);
        boolean flag = image.imageInputstream(filecontent, extnsn, filename);
        if (flag == true) {
            out.println("<html><body onload=\"alert('Image uploaded successful')\"></body></html>");
        } else {
            out.println("<html><body onload=\"alert('Image not uploaded successful')\"></body></html>");
        }
    }
}
