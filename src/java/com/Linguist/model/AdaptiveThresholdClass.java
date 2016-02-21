/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linguist.model;

import java.io.File;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import static org.opencv.imgproc.Imgproc.ADAPTIVE_THRESH_MEAN_C;
import static org.opencv.imgproc.Imgproc.THRESH_BINARY;
import static org.opencv.imgproc.Imgproc.adaptiveThreshold;

/**
 *
 * @author User
 */
public class AdaptiveThresholdClass implements Preprocessable {

    public File imagePreprocessing(String imageFile, String extnsn) {
        //  System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat graySource = imread("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\" + imageFile, IMREAD_GRAYSCALE);
        Mat destintn = new Mat(graySource.rows(), graySource.cols(), graySource.type());

        adaptiveThreshold(graySource, destintn, 255, ADAPTIVE_THRESH_MEAN_C, THRESH_BINARY, 15, 40);
        Imgcodecs.imwrite("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\adaptive.jpg", destintn);
        File outputImage = new File("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\adaptive.jpg");
        return outputImage;
    }

}
