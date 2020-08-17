package org.academiadecodigo.floppybirds.chicken;

public class CarLeftToRight extends Car {

    private final int POSINITX = Field.PADDING;

    public CarLeftToRight(int posX, int posY, String picture){

        super(posX, posY, picture);
    }


    @Override
    public void carMove(){

        if (posX < Field.PADDING + Field.WIDTH + Field.BORDER) {

            car.translate(5, 0);
            posX = posX + 5;
            if (posX < 160) {
                leftSoon = true;
            }
            if (posX >= 160) {
                leftSoon = false;
            }
            return;

        }
        car.translate(- Field.WIDTH - Field.BORDER, 0);
        posX = POSINITX;
        isParked = true;
    }

}
