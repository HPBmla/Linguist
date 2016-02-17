/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linguist.control;

import com.Linguist.model.imageUpload;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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

        Part uploadedImage = request.getPart("image");

        String filename = uploadedImage.getSubmittedFileName();
        String path = "C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\" + filename;

        File pathName = new File(path);
        // String fileAbsName = pathName.getAbsolutePath();
        request.setAttribute("name", filename);
        // out.println(filename);
        // out.println(pathName.getPath());
        InputStream filecontent = uploadedImage.getInputStream();
        imageUpload image = new imageUpload();
        String extnsn = image.getExtensn(filename);
        //  out.println(extnsn);
        boolean flag = image.imageInputstream(filecontent, extnsn, filename);
        if (flag == true) {
            out.println("<html><body onload=\"alert('Image uploaded successful')\"></body></html>");
        } else {
            out.println("<html><body onload=\"alert('Image not uploaded successful')\"></body></html>");
        }

        //returning name of the image to another jsp page
        RequestDispatcher rd = request.getRequestDispatcher("/imageView.jsp");
        rd.forward(request, response);
        // response.sendRedirect("/Linguist/imageView.jsp");
    }
}
