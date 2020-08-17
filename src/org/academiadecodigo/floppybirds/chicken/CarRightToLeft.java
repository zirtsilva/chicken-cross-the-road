package org.academiadecodigo.floppybirds.chicken;

public class CarRightToLeft extends Car {

    private final int POSINITX = Field.PADDING + Field.WIDTH + Field.BORDER;

    public CarRightToLeft(int posX, int posY, String picture){

        super(posX, posY, picture);
    }

    @Override
    public void carMove(){

        if (posX > Field.PADDING) {

            car.translate(-5, 0);
            posX = posX - 5;
            if (posX > 880){
                leftSoon = true;
            } else {
                leftSoon = false;
            }
            return;
        }
        car.translate(Field.WIDTH + Field.BORDER, 0);
        posX = POSINITX;
        isParked = true;
    }

}
