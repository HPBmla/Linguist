/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sourceforge.tess4j.ocr;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author Bimla Madhavee
 */
public class TesseractOcr {

    public String performOcr(File image) {

        String extractedTxt = null;
        try {
            Tesseract tess = new Tesseract();
            extractedTxt = tess.doOCR(image);
            if (extractedTxt.isEmpty()) {
                System.out.println("Couldn't extract the text");
            } else {
                System.out.println("Successfully extracted");
            }

        } catch (TesseractException ex) {
            System.err.println(ex.getMessage());
        }
        return extractedTxt;
    }

    /* public static void main(String args[]) {
     // System.loadLibrary("libtesseract304");
     File imagineFile = new File("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\adaptive.jpg");
     Tesseract instance = new Tesseract();
     try {
     String result = instance.doOCR(imagineFile);
     System.out.println(result);
     } catch (TesseractException ex) {
     System.err.println(ex.getMessage());

     }
     }*/
}
