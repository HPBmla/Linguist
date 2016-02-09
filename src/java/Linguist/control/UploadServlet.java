/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linguist.control;

import Linguist.model.imageUpload;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
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

        /* boolean isMultipart = ServletFileUpload.isMultipartContent(request);

         if (isMultipart) {
         FileItemFactory factory = new DiskFileItemFactory();
         ServletFileUpload upload = new ServletFileUpload(factory);

         try {
         List items = upload.parseRequest(request);
         Iterator iterator = items.iterator();
         while (iterator.hasNext()) {
         FileItem item = (FileItem) iterator.next();

         if (!item.isFormField()) {

         String fileName = item.getName();
         String root = getServletContext().getRealPath("/");

         //path where the file will be stored
         File path = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Linguist" + "/uploads");
         if (!path.exists()) {
         boolean status = path.mkdirs();
         }

         File uploadedFile = new File(path + "/" + fileName);
         System.out.println(uploadedFile.getAbsolutePath());
         item.write(uploadedFile);
         }

         }
         } catch (FileUploadException ex) {
         Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
         } catch (Exception ex) {
         Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
         } */
        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        Part partImage = request.getPart("upldImge");
        String destination = "C:\\Users\\User\\Documents\\NetBeansProjects\\Linguist";
        String extension = "jpg";
        imageUpload upload = new imageUpload();
        boolean flag = upload.uploadImage(partImage);
        if (flag == true) {
            System.out.print("successfull");
        }
        getServletContext().getRequestDispatcher("imageView.jsp").forward(request, response);
    }
}
