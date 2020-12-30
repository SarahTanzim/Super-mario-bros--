package view;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameEngineTest {
    GameEngineTest il;
    public GameEngineTest() {
    }
    @Before
    public void setUp(){
        il = new GameEngineTest();
    }

    @Test
    public void resetCamera() {
        getCameraLocation();
        getGameStatus();
    }

    @Test
    public void selectMapViaMouse() {
        resetCamera();
        getImageLoader();
    }

    @Test
    public void selectMapViaKeyboard() {
        toString();
        getMapManager();
        getSelectedMap();
    }

    @Test
    public void changeSelectedMap() {

    }

    @Test
    public void run() {
         resetCamera();
         getImageLoader();
         getGameStatus();

    }

    @Test
    public void receiveInput() {
        getRemainingLives();
        getMapManager();
    }

    @Test
    public void shakeCamera() {
        getStartScreenSelection();
        getRemainingLives();
    }

    @Test
    public void getImageLoader() {
        getStartScreenSelection();
    }

    @Test
    public void getGameStatus() {
    }

    @Test
    public void getStartScreenSelection() {
    }

    @Test
    public void setGameStatus() {
    }

    @Test
    public void getScore() {
    }

    @Test
    public void getRemainingLives() {
    }

    @Test
    public void getCoins() {
    }

    @Test
    public void getSelectedMap() {
    }

    @Test
    public void drawMap() {
    }

    @Test
    public void getCameraLocation() {
    }

    @Test
    public void playCoin() {
    }

    @Test
    public void playOneUp() {
    }

    @Test
    public void playSuperMushroom() {
    }

    @Test
    public void playMarioDies() {
    }

    @Test
    public void getMapManager() {
    }
}