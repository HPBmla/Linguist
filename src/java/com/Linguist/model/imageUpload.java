/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linguist.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class imageUpload {

    /*  public boolean uploadImage(Part imgPart) {

     //extension = extnsn;
     boolean flag = false;

     // String imageName = imgPart.getSubmittedFileName();
     try {
     System.out.println("writing the image");
     imgPart.write(destinatn);

     } catch (IOException ex) {
     ex.printStackTrace();
     }
     return flag;

     }*/
    public String getExtensn(String filenme) {
        String extn = filenme.substring(filenme.lastIndexOf("."));
        return extn;
    }

    /*  public boolean uploadImge(String image, String extns) {
     boolean flag = false;
     try {

     File imageFile = new File(image + "." + extns);
     File path = new File("/web/img" + imageFile);
     BufferedImage buffImage = ImageIO.read(imageFile);
     System.out.println("writing the image");
     flag = ImageIO.write(buffImage, "jpg", path);
     if (flag == true) {
     System.out.println("hurrayy");
     }

     } catch (IOException ex) {
     ex.printStackTrace();
     }
     return flag;
     }*/
    public boolean imageInputstream(InputStream imgePrt, String extension, String name) {
        boolean flag = false;
        try {
            File path = new File("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\" + name);
            BufferedImage bufImage = ImageIO.read(imgePrt);
            String extn = null;
            switch (extension) {
                case ".jpg":
                    extn = "jpg";
                    break;
                case ".png":
                    extn = "png";
                    break;
                case ".pdf":
                    extn = "pdf";
                    break;
                case ".tiff":
                    extn = "tif";
                    break;

            }
            flag = ImageIO.write(bufImage, extn, path);
            if (flag == true) {
                System.out.println("hurrayy");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    /*  public boolean anotherImageUpload(InputStream imgStrm, String ext, String name)
     {
     boolean flag = false;


     }*/
}
