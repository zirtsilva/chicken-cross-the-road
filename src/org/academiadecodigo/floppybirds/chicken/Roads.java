package org.academiadecodigo.floppybirds.chicken;

public enum Roads {

    ROAD1(Field.PADDING + Field.BORDER + Field.WIDTH, 43),
    ROAD2(Field.PADDING + Field.BORDER + Field.WIDTH, 76),
    ROAD3(Field.PADDING + Field.BORDER + Field.WIDTH, 109),
    ROAD4(Field.PADDING + Field.BORDER + Field.WIDTH, 142),

    ROAD5(Field.PADDING, 175),
    ROAD6(Field.PADDING,208),
    ROAD7(Field.PADDING,241),
    ROAD8(Field.PADDING,274);


    int X;
    int Y;

    Roads(int X, int Y){
        this.X = X;
        this.Y = Y;
    }
}
