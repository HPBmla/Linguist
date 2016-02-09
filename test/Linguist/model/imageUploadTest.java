/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linguist.model;

import javax.servlet.http.Part;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author User
 */
public class imageUploadTest {

    public imageUploadTest() {
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
     * Test of uploadImage method, of class imageUpload.
     */
    @Test
    public void testUploadImage() {
        System.out.println("uploadImage");
        Part imgPart = null;
        imageUpload instance = new imageUpload();

        boolean result = instance.uploadImage(imgPart);
        assertTrue(result);

    }

    /**
     * Test of getExtensn method, of class imageUpload.
     */
    @Test
    public void testGetExtensn() {
        System.out.println("getExtensn");
        String filenme = "";
        imageUpload instance = new imageUpload();
        String expResult = "";
        String result = instance.getExtensn(filenme);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
