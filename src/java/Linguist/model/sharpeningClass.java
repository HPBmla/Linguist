/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linguist.model;

import java.io.File;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Bimla Madhavee
 */
public class sharpeningClass implements Preprocessable {

    public File imagePreprocessing(String imgeNme) {
        int kernelSize = 9;
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat sourceImage = Imgcodecs.imread(imgeNme, Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
        Mat destinationImage = new Mat(sourceImage.rows(), sourceImage.cols(), sourceImage.type());
        //definning the kernel
        Mat defineKernel = new Mat(kernelSize, kernelSize, CvType.CV_32F) {
            {
                put(0, 0, 0);
                put(0, 1, -1);
                put(0, 2, 0);

                put(1, 0, -1);
                put(1, 1, 4);
                put(1, 2, -1);

                put(2, 0, 0);
                put(2, 1, -1);
                put(2, 2, 0);
            }

        };
        Imgproc.filter2D(sourceImage, destinationImage, -1, defineKernel);
        imageUpload ext = new imageUpload();
        String extension = ext.getExtensn(imgeNme);
        //defining the name of the sharpened image
        String fileName = "sharpen" + "." + extension;
        //writing the output image
        Imgcodecs.imwrite(fileName, destinationImage);
        File sharpenImage = new File(fileName);
        return sharpenImage;

    }

}
