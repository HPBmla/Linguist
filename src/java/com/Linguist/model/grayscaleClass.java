/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linguist.model;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Bimla Madhavee
 */
public class grayscaleClass implements Preprocessable {

    /**
     *
     * @param image
     * @return
     */
    @Override
    public File imagePreprocessing(String image) {
        BufferedImage bImge, bImage2 = null;
        File grayscle = null;
        try {
            // loadOpenCV_Lib();
            System.loadLibrary("opencv_java300");
            File fileName = new File(image);
            bImge = ImageIO.read(fileName);
            byte[] imgeByte = ((DataBufferByte) bImge.getRaster().getDataBuffer()).getData();
            Mat mat1 = new Mat(bImge.getHeight(), bImge.getWidth(), CvType.CV_8UC3);
            mat1.put(0, 0, imgeByte);
            Mat mat2 = new Mat(bImge.getHeight(), bImge.getWidth(), CvType.CV_8UC1);
            Imgproc.cvtColor(mat1, mat2, Imgproc.COLOR_RGB2GRAY);
            byte[] imageData = new byte[mat2.rows() * mat2.cols() * (int) (mat2.elemSize())];
            mat2.get(0, 0, imageData);
            bImage2 = new BufferedImage(mat2.rows(), mat2.cols(), BufferedImage.TYPE_BYTE_GRAY);
            bImage2.getRaster().setDataElements(0, 0, mat2.cols(), mat2.rows(), imageData);

            //getting the extension of the image
            imageUpload extnsion = new imageUpload();
            String extn = extnsion.getExtensn(image);
            //writing the grayscale image to the folder
            grayscle = new File("grayscale" + "." + extn);
            ImageIO.write(bImage2, extn, grayscle);
        } catch (IOException ex) {
            System.out.println("" + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(grayscaleClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grayscle;

    }

    public static void loadOpenCV_Lib() throws Exception {
        String model = System.getProperty("sun.arch.data.model");
        String libraryPath = "C:/opencv/build/java/x64/";
        if (model.equals("64")) {
            libraryPath = "C:/opencv/build/java/x86/";
        }
        System.setProperty("java.library.path", libraryPath);
        Field sysPath = ClassLoader.class.getDeclaredField("sys_paths");
        sysPath.setAccessible(true);
        sysPath.set(null, null);
        //  System.loadLibrary("opencv_java300");
    }

}
