/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linguist.model;

/**
 *
 * @author User
 */
public class imageUpload {

    public String destinatn = "C:\\Users\\User\\Documents\\NetBeansProjects\\Linguist";
    public String extension;

    public boolean uploadImage(String extnsn, String destn) {
        extension = extnsn;

        return false;

    }

    public String getExtensn(String filenme) {
        String extn = filenme.substring(filenme.lastIndexOf("."));
        return extn;
    }

}
