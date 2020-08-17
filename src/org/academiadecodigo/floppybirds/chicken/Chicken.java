package org.academiadecodigo.floppybirds.chicken;

import org.academiadecodigo.bootcamp.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Chicken {

    private Picture chicken;
    private Picture chickenDead;
    private int chickenSize = 30;
    private int posX = 490;
    private int posY = 307;
    private final int initX = 490;
    private final int initY = 307;
    private boolean isDead;
    private boolean canMove;
    private Text scoreCounter;
    private Sound chickenSound;
    private Sound ping;


    public Chicken() {

        chicken = new Picture(posX, posY, "resources/fatChicken.png");
        chicken.draw();
        isDead = false;
        canMove = false;

        scoreCounter = new Text(940,313, "" + Game.score);
        scoreCounter.setColor(Color.BLACK);
        scoreCounter.grow(8,8);
        scoreCounter.draw();

        chickenSound = new Sound ("/resources/chickenSound.wav");
        ping = new Sound("/resources/ping.wav");
    }

    public void moveLeft() {
        if (!isDead && canMove) {
            if (!(posX <= Field.PADDING + Field.BORDER)) {
                chicken.translate(-chickenSize, 0);
                posX = posX - chickenSize;
            }
        }
    }

    public void moveRight() {
        if (!isDead && canMove) {
            if (!(posX >= Field.WIDTH + Field.BORDER + Field.PADDING - chickenSize)) {
                chicken.translate(chickenSize, 0);
                posX = posX + chickenSize;
            }
        }
    }

    public void moveUp(){
        if (!isDead && canMove) {
            if (!(posY <= Field.PADDING)) {
                chicken.translate(0, -chickenSize - Field.LINE_HEIGHT);
                posY = posY - chickenSize - Field.LINE_HEIGHT;
                chickenSound.play(true);
                return;
            }
            finishLineChecker();
        }
    }

    public void moveDown() {
        if (!isDead && canMove) {
            if (!(posY >= Field.HEIGHT + Field.PADDING - chickenSize)) {
                chicken.translate(0, chickenSize + Field.LINE_HEIGHT);
                posY = posY + chickenSize + Field.LINE_HEIGHT;
            }
        }
    }

    public void resetChickenPos(){
        canMove = false;
        ping.play(true);
        if (posX != initX) {
            chicken.translate(initX - posX, Field.HEIGHT - chickenSize);
        } else {
            chicken.translate(0, Field.HEIGHT - chickenSize);
        }
        posX = initX;
        posY = initY;
    }



    public void finishLineChecker() {
        Game.score++;

        scoreCounter.delete();
        scoreCounter = new Text(940,313, "" + Game.score);
        scoreCounter.setColor(Color.BLACK);
        scoreCounter.grow(8,8);
        scoreCounter.draw();
        resetChickenPos();
        canMove = true;
        if(Game.carsMathRandomValue > 40) {
            Game.carsMathRandomValue -= 20;
        }
        if(Game.carsThreadSleepValue > 10) {
            Game.carsThreadSleepValue -= 2;
        }
    }


    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setIsDead(boolean d) {
        isDead = d;
    }

    public boolean getIsDead() {
        return isDead;
    }

    public void setDeadChicken() {
        chickenDead = new Picture(getPosX(), getPosY(), "resources/fatDeadChicken.png");
        chickenDead.draw();
    }

    public void setCanMove(boolean m) {
        canMove = m;
    }

}
