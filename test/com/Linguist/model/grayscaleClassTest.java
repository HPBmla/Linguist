/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linguist.model;

import com.Linguist.model.grayscaleClass;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author User
 */
public class grayscaleClassTest {

    public grayscaleClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of imagePreprocessing method, of class grayscaleClass.
     */
    @Test
    public void testImagePreprocessing() {
        System.out.println("imagePreprocessing");
        String image = "pink.jpg";
        grayscaleClass instance = new grayscaleClass();
        String exp = "gray.jpg";
        File expResult = new File(exp);
        File result = instance.imagePreprocessing(image);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
