/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linguist.model;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
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
     * @param extnsn
     * @return
     */
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    @Override
    public File imagePreprocessing(String image, String extnsn) {

        BufferedImage bImge = null;
        BufferedImage bImage2 = null;
        File grayscle = null;

        try {

            // loadOpenCV_Lib();
            //String path = "opencv\\build\\java\\x64\\opencv_java300.dll";
            FileInputStream fileName = new FileInputStream("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\" + image);
            InputStream input = fileName;
            bImge = ImageIO.read(input);
            byte[] imgeByte = ((DataBufferByte) bImge.getRaster().getDataBuffer()).getData();
            Mat mat1 = new Mat(bImge.getHeight(), bImge.getWidth(), CvType.CV_8UC3);
            mat1.put(0, 0, imgeByte);
            Mat mat2 = new Mat(bImge.getHeight(), bImge.getWidth(), CvType.CV_8UC1);
            Imgproc.cvtColor(mat1, mat2, Imgproc.COLOR_RGB2GRAY);
            byte[] imageData = new byte[mat2.rows() * mat2.cols() * (int) (mat2.elemSize())];
            mat2.get(0, 0, imageData);
            bImage2 = new BufferedImage(mat2.cols(), mat2.rows(), BufferedImage.TYPE_BYTE_GRAY);
            bImage2.getRaster().setDataElements(0, 0, mat2.cols(), mat2.rows(), imageData);

            String extn = null;
            switch (extnsn) {
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
            //writing the grayscale image to the folder
            grayscle = new File("C:\\Users\\User\\Documents\\GitHub\\Linguist\\web\\uploadedImage\\grayscale" + "." + extn);
            ImageIO.write(bImage2, "jpg", grayscle);
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
        // System.loadLibrary("opencv_java300");
    }
}
