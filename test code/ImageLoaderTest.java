package view;
import org.junit.Before;
import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class ImageLoaderTest {
    ImageLoader il;
    public ImageLoaderTest() {
    }

    @Before
    public void setUp(){
        il = new ImageLoader();
    }


    @Test
    public void loadImage() {
        System.out.println("loadImage");
        String path = "/mario-forms.png";
        String expResult = "java.awt.image.BufferedImage";
        BufferedImage bi = il.loadImage(path);
        if(bi == null)
            fail("A null return.");
        String result = bi.getClass().getName();
        assertEquals(expResult, result);
    }
    
}