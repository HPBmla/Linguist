/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linguist.model;

import java.io.IOException;
import javax.servlet.http.Part;

/**
 *
 * @author User
 */
public class imageUpload {

    public String destinatn = " C:\\Users\\User\\Documents\\NetBeansProjects\\Linguist\\img ";
    public String extension;

    public boolean uploadImage(Part imgPart) {

        //extension = extnsn;
        boolean flag = false;

        // String imageName = imgPart.getSubmittedFileName();
        try {
            imgPart.write(destinatn);
            flag = true;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return flag;

    }

    public String getExtensn(String filenme) {
        String extn = filenme.substring(filenme.lastIndexOf("."));
        return extn;
    }

}
