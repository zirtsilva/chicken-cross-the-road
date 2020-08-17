package org.academiadecodigo.floppybirds.chicken;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {

    public static final int BORDER = 60;

    public static final int PADDING = 10;
    public static final int WIDTH = 900;
    public static final int HEIGHT = 327;

    public static final int LINE_HEIGHT = 3;

    public Field(){
        Picture field = new Picture(PADDING + BORDER, PADDING, "resources/Field.png");
        field.draw();
    }
}
