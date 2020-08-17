package org.academiadecodigo.floppybirds.chicken;

import org.academiadecodigo.bootcamp.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Car[] cars = new Car[40];
    private Chicken chicken;
    private boolean gameOver;
    public static int score = 0;
    private int scoreInt;
    private Picture mainScreen;
    private Picture instructionsScreen;
    private Picture gameOverScreen;
    private Picture scoreCounter;
    public static int carsMathRandomValue;
    public static int carsThreadSleepValue;
    Text stringScore;
    Sound traffic;
    Sound deadChicken;

    public void init(){


        Field field = new Field();
        chicken = new Chicken();

        Controls controls = new Controls();
        controls.init();
        controls.setChicken(chicken);

        cars[0] = new CarRightToLeft(Roads.ROAD1.X, Roads.ROAD1.Y, "resources/carRLgreen.png");
        cars[1] = new CarRightToLeft(Roads.ROAD1.X, Roads.ROAD1.Y, "resources/carRLblue.png");
        cars[2] = new CarRightToLeft(Roads.ROAD1.X, Roads.ROAD1.Y, "resources/carRLred.png");
        cars[3] = new CarRightToLeft(Roads.ROAD1.X, Roads.ROAD1.Y, "resources/carRLyellow.png");
        cars[4] = new CarRightToLeft(Roads.ROAD1.X, Roads.ROAD1.Y, "resources/carRLgreen.png");
        cars[5] = new CarRightToLeft(Roads.ROAD2.X, Roads.ROAD2.Y, "resources/carRLgreen.png");
        cars[6] = new CarRightToLeft(Roads.ROAD2.X, Roads.ROAD2.Y, "resources/carRLblue.png");
        cars[7] = new CarRightToLeft(Roads.ROAD2.X, Roads.ROAD2.Y, "resources/carRLred.png");
        cars[8] = new CarRightToLeft(Roads.ROAD2.X, Roads.ROAD2.Y, "resources/carRLyellow.png");
        cars[9] = new CarRightToLeft(Roads.ROAD2.X, Roads.ROAD2.Y, "resources/carRLgreen.png");
        cars[10] = new CarRightToLeft(Roads.ROAD3.X, Roads.ROAD3.Y, "resources/carRLgreen.png");
        cars[11] = new CarRightToLeft(Roads.ROAD3.X, Roads.ROAD3.Y, "resources/carRLblue.png");
        cars[12] = new CarRightToLeft(Roads.ROAD3.X, Roads.ROAD3.Y, "resources/carRLred.png");
        cars[13] = new CarRightToLeft(Roads.ROAD3.X, Roads.ROAD3.Y, "resources/carRLyellow.png");
        cars[14] = new CarRightToLeft(Roads.ROAD3.X, Roads.ROAD3.Y, "resources/carRLgreen.png");
        cars[15] = new CarRightToLeft(Roads.ROAD4.X, Roads.ROAD4.Y, "resources/carRLgreen.png");
        cars[16] = new CarRightToLeft(Roads.ROAD4.X, Roads.ROAD4.Y, "resources/carRLblue.png");
        cars[17] = new CarRightToLeft(Roads.ROAD4.X, Roads.ROAD4.Y, "resources/carRLred.png");
        cars[18] = new CarRightToLeft(Roads.ROAD4.X, Roads.ROAD4.Y, "resources/carRLyellow.png");
        cars[19] = new CarRightToLeft(Roads.ROAD4.X, Roads.ROAD4.Y, "resources/carRLgreen.png");
        cars[20] = new CarLeftToRight(Roads.ROAD5.X, Roads.ROAD5.Y, "resources/carLRgreen.png");
        cars[21] = new CarLeftToRight(Roads.ROAD5.X, Roads.ROAD5.Y, "resources/carLRblue.png");
        cars[22] = new CarLeftToRight(Roads.ROAD5.X, Roads.ROAD5.Y, "resources/carLRred.png");
        cars[23] = new CarLeftToRight(Roads.ROAD5.X, Roads.ROAD5.Y, "resources/carLRyellow.png");
        cars[24] = new CarLeftToRight(Roads.ROAD5.X, Roads.ROAD5.Y, "resources/carLRgreen.png");
        cars[25] = new CarLeftToRight(Roads.ROAD6.X, Roads.ROAD6.Y, "resources/carLRgreen.png");
        cars[26] = new CarLeftToRight(Roads.ROAD6.X, Roads.ROAD6.Y, "resources/carLRblue.png");
        cars[27] = new CarLeftToRight(Roads.ROAD6.X, Roads.ROAD6.Y, "resources/carLRred.png");
        cars[28] = new CarLeftToRight(Roads.ROAD6.X, Roads.ROAD6.Y, "resources/carLRyellow.png");
        cars[29] = new CarLeftToRight(Roads.ROAD6.X, Roads.ROAD6.Y, "resources/carLRgreen.png");
        cars[30] = new CarLeftToRight(Roads.ROAD7.X, Roads.ROAD7.Y, "resources/carLRgreen.png");
        cars[31] = new CarLeftToRight(Roads.ROAD7.X, Roads.ROAD7.Y, "resources/carLRblue.png");
        cars[32] = new CarLeftToRight(Roads.ROAD7.X, Roads.ROAD7.Y, "resources/carLRred.png");
        cars[33] = new CarLeftToRight(Roads.ROAD7.X, Roads.ROAD7.Y, "resources/carLRyellow.png");
        cars[34] = new CarLeftToRight(Roads.ROAD7.X, Roads.ROAD7.Y, "resources/carLRgreen.png");
        cars[35] = new CarLeftToRight(Roads.ROAD8.X, Roads.ROAD8.Y, "resources/carLRgreen.png");
        cars[36] = new CarLeftToRight(Roads.ROAD8.X, Roads.ROAD8.Y, "resources/carLRblue.png");
        cars[37] = new CarLeftToRight(Roads.ROAD8.X, Roads.ROAD8.Y, "resources/carLRred.png");
        cars[38] = new CarLeftToRight(Roads.ROAD8.X, Roads.ROAD8.Y, "resources/carLRyellow.png");
        cars[39] = new CarLeftToRight(Roads.ROAD8.X, Roads.ROAD8.Y, "resources/carLRgreen.png");

        Picture rightBorder;
        rightBorder = new Picture(969, 10, "resources/tunnelsRight.png");
        rightBorder.draw();

        Picture leftBorder;
        leftBorder = new Picture(9, 10, "resources/tunnelsLeft.png");
        leftBorder.draw();

        scoreCounter = new Picture(820, 307, "resources/scoreCounter.png");
        scoreCounter.draw();

        instructionsScreen = new Picture(Field.PADDING, Field.PADDING, "resources/instructionsScreen.png");
        instructionsScreen.draw();

        mainScreen = new Picture(Field.PADDING, Field.PADDING, "resources/mainScreen.png");
        mainScreen.draw();

        traffic = new Sound("/resources/traffic.wav");

    }



    public void showInstructions(){
        mainScreen.delete();
    }

    public void hideScreens(){
        instructionsScreen.delete();
        mainScreen.delete();
        chicken.setCanMove(true);
        traffic.setLoop(1000);
    }

    public void start() throws InterruptedException{
        carsMathRandomValue = 400;
        carsThreadSleepValue = 50;

        while (!chicken.getIsDead()) {

            Thread.sleep(carsThreadSleepValue);
            moveCars();

        }
    }

    public void moveCars() {

        int temp = choseCarToMove();
        if (temp < 40) {
            if (cars[temp].isParked) {
                checkIfLeftSoon(temp);
            }
        }
        for (Car c : cars) {
            if (!c.isParked) {
                c.carMove();
                collisionDetector(c);
                scoreInt = score;
            }
        }
    }

    public int choseCarToMove(){
        return (int) Math.floor(Math.random() * carsMathRandomValue);
    }

    public void checkIfLeftSoon(int num){

        if (num >= 0 && num <= 4){

            if ((cars[0].leftSoon) || (cars[1].leftSoon) || (cars[2].leftSoon) || (cars[3].leftSoon) || (cars[4].leftSoon)){
                cars[num].isParked = true;
            } else {
                cars[num].isParked = false;
            }
        }

        if (num >= 5 && num <= 9){
            if (cars[5].leftSoon || cars[6].leftSoon || cars[7].leftSoon || cars[8].leftSoon || cars[9].leftSoon){
                cars[num].isParked = true;
            } else {
                cars[num].isParked = false;
            }
        }

        if (num >= 10 && num <= 14){
            if (cars[10].leftSoon || cars[11].leftSoon || cars[12].leftSoon || cars[13].leftSoon || cars[14].leftSoon){
                cars[num].isParked = true;
            } else {
                cars[num].isParked = false;
            }
        }

        if (num >= 15 && num <= 19){
            if (cars[15].leftSoon || cars[16].leftSoon || cars[17].leftSoon || cars[18].leftSoon || cars[19].leftSoon){
                cars[num].isParked = true;
            } else {
                cars[num].isParked = false;
            }
        }

        if (num >= 20 && num <= 24){
            if (cars[20].leftSoon || cars[21].leftSoon || cars[22].leftSoon || cars[23].leftSoon || cars[24].leftSoon){
                cars[num].isParked = true;
            } else {
                cars[num].isParked = false;
            }
        }

        if (num >= 25 && num <= 29){
            if (cars[25].leftSoon || cars[26].leftSoon || cars[27].leftSoon || cars[28].leftSoon || cars[29].leftSoon){
                cars[num].isParked = true;
            } else {
                cars[num].isParked = false;
            }
        }

        if (num >= 30 && num <= 34){
            if (cars[30].leftSoon || cars[31].leftSoon || cars[32].leftSoon || cars[33].leftSoon || cars[34].leftSoon){
                cars[num].isParked = true;
            } else {
                cars[num].isParked = false;
            }
        }

        if (num >= 35 && num <= 39){
            if (cars[35].leftSoon || cars[36].leftSoon || cars[37].leftSoon || cars[38].leftSoon || cars[39].leftSoon){
                cars[num].isParked = true;
            } else {
                cars[num].isParked = false;
            }
        }

    }


    public void collisionDetector(Car c){
        if(chicken.getPosY() == c.posY){
            if ((chicken.getPosX() >= c.posX && chicken.getPosX() <= c.posX + 60) || (chicken.getPosX() + 30 >= c.posX && chicken.getPosX() + 30 <= c.posX + 60)){
                gameOver = true;
                chicken.setIsDead(true);
                chicken.setDeadChicken();
                traffic.close();
                deadChicken = new Sound("/resources/coffin.wav");
                deadChicken.play(true);
                gameOverScreen = new Picture(Field.PADDING, Field.PADDING, "resources/gameOver.png");
                gameOverScreen.draw();
                stringScore = new Text(570, 229, "" + scoreInt);
                stringScore.setColor(Color.WHITE);
                stringScore.grow(8, 8);
                stringScore.draw();
                score = 0;
            }
        }
    }
}
