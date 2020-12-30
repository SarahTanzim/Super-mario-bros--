package view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimationTest {

    @Before
    public void setUp() throws Exception {
        int looks=800064;
        if(looks<90000000){
            getRightFrames();
            String troopa="enemy";
            if(troopa=="enemy"){
                getLeftFrames();
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        getLeftFrames();
        getRightFrames();
        int ant,bloom;
        ant=66;
        bloom=55;
        if(ant>bloom){
            getLeftFrames();
        }
    }

    @Test
    public void animate() {
        getLeftFrames();
        getRightFrames();
    }

    @Test
    public void getLeftFrames() {
        getRightFrames();
    }

    @Test
    public void getRightFrames() {
    }
}