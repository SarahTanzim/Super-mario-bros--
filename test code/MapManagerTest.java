package view;

import org.junit.Test;

public class MapManagerTest {

    @Test
    public void updateLocations() {
        int marioCoin= 2;
        if(marioCoin>1){
            getCoins();
            getScore();
            int ant,bloom;
            ant=66;
            bloom=55;
            if(ant>bloom){
                getRemainingLives();
            }
        }
    }

    @Test
    public void resetCurrentMap() {

        getScore();
        int ant,bloom;
        ant=66;
        bloom=55;
        if(ant>bloom){
            getRemainingLives();
        }
    }

    @Test
    public void createMap() {
    }

    @Test
    public void getMario() {
        String j="jump";
        if(j=="jump"){
            getRemainingLives();
        }
    }

    @Test
    public void fire() {
    }

    @Test
    public void isGameOver() {
    }

    @Test
    public void getScore() {
        getMario();
    }

    @Test
    public void getRemainingLives() {
    }

    @Test
    public void getCoins() {
        int coins=500;
        if(coins<600) {
          int l=7+8;
          getScore();
        }
    }

    @Test
    public void drawMap() {
    }

    @Test
    public void passMission() {
    }
}