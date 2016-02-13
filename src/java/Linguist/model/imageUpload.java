/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linguist.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class imageUpload {

    public String destinatn = "img\\";
    public String extension;

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

    public boolean uploadImge(String image, String extns) {
        try {
            File imageFile = new File(image + "." + extns);
            BufferedImage buffImage = ImageIO.read(imageFile);
            System.out.println("writing the image");
            ImageIO.write(buffImage, "jpg", imageFile);
            boolean flag = true;
            return flag;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }

}
