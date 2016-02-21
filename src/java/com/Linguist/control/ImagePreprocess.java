/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linguist.control;

import com.Linguist.model.AdaptiveThresholdClass;
import com.Linguist.model.grayscaleClass;
import com.Linguist.model.imageUpload;
import com.Linguist.model.sharpeningClass;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author Bimla Madhavee
 */
@WebServlet(name = "ImagePreprocess", urlPatterns = {"/ImagePreprocess"})
@MultipartConfig
public class ImagePreprocess extends HttpServlet {

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

        try {
            PrintWriter out = response.getWriter();
            HttpSession fileNameSession = request.getSession();
            String imageName = (String) fileNameSession.getAttribute("filename");
            // out.print(imageName);
            grayscaleClass grayImage = new grayscaleClass();
            imageUpload img = new imageUpload();
            String extn = img.getExtensn(imageName);
            File fileNme = new File(imageName);
            File outputGrayImage = grayImage.imagePreprocessing(imageName, "jpg");
            String grayImageName = outputGrayImage.getName();
            sharpeningClass sharpImage = new sharpeningClass();
            File afterSharpen = sharpImage.imagePreprocessing(grayImageName, "jpg");
            String sharpnName = afterSharpen.getName();
            out.print(afterSharpen);
            AdaptiveThresholdClass adptive = new AdaptiveThresholdClass();

            File finlImage = adptive.imagePreprocessing(sharpnName, "jpg");
            // if (outputGrayImage != null) {
            /*   BufferedImage gray = ImageIO.read(fileNme);
             File outImge = new File("grayImage.jpg");
             ImageIO.write(gray, "jpg", outImge);*/
            /*     out.println("<html><body onload=\"alert('Image uploaded successful')\"></body></html>");
             } else {
             out.println("<html><body onload=\"alert('Image not successful')\"></body></html>");
             }*/
            out.print("Its thissss");
            /* TesseractOcr tessInstnce = new TesseractOcr();
             File image = new File("pink.jpg");
             String text = tessInstnce.performOcr(image);
             if (text.isEmpty()) {
             out.print("null");
             } else {
             out.println(text);
             }*/
            Tesseract tess = new Tesseract();
            out.println("calling");

            if (finlImage != null) {
                out.println("got the image");
            }
            String text = tess.doOCR(finlImage);
            out.println(text);
            if (text == null) {
                out.println("null");
            }
        } catch (TesseractException ex) {
            out.println("wrongg");
        }
    }

}
