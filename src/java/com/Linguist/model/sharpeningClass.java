/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linguist.model;

import java.io.File;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Bimla Madhavee
 */
public class sharpeningClass implements Preprocessable {

    public File imagePreprocessing(String imgeNme, String extnsn) {
        File sharpen = null;
        try {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat source = Imgcodecs.imread("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\" + imgeNme,
                    Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
            Mat destination = new Mat(source.rows(), source.cols(), source.type());

            Imgproc.equalizeHist(source, destination);
            Imgcodecs.imwrite("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\contrast.jpg", destination);
            sharpen = new File("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\contrast.jpg");
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return sharpen;
    }

}
