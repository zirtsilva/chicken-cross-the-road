package org.academiadecodigo.floppybirds.chicken;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Car {

    Picture car;
    public boolean isParked = true;
    public boolean leftSoon;
    public int posX;
    public int posY;
    private int width = 60;
    private int height = 30;


    public Car(int posX, int posY, String picture) {

        car = new Picture(posX, posY, picture);
        car.draw();
        this.posX = posX;
        this.posY = posY;
    }

    public abstract void carMove();


}


