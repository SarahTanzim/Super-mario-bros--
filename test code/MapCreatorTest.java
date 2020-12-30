package view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapCreatorTest {

    @Before
    public void setUp() throws Exception {
        String mapcreation="map has been created";
        int canvas=0;
        if(canvas<1){
            int cargo=2;
            createMap();
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createMap() {
    }
}