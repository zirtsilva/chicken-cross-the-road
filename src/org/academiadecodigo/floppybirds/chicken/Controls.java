package org.academiadecodigo.floppybirds.chicken;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    private Keyboard keyboard;
    private Chicken chicken;

    public void init() {

        keyboard = new Keyboard(this);

        KeyboardEvent pressedRight = new KeyboardEvent();
        pressedRight.setKey(KeyboardEvent.KEY_RIGHT);
        pressedRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pressedRight);

        KeyboardEvent pressedLeft = new KeyboardEvent();
        pressedLeft.setKey(KeyboardEvent.KEY_LEFT);
        pressedLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pressedLeft);

        KeyboardEvent pressedUp = new KeyboardEvent();
        pressedUp.setKey(KeyboardEvent.KEY_UP);
        pressedUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pressedUp);

        KeyboardEvent releasedUp = new KeyboardEvent();
        releasedUp.setKey(KeyboardEvent.KEY_UP);
        releasedUp.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(releasedUp);

        KeyboardEvent pressedDown = new KeyboardEvent();
        pressedDown.setKey(KeyboardEvent.KEY_DOWN);
        pressedDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pressedDown);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                chicken.moveLeft();
                break;
            case KeyboardEvent.KEY_RIGHT:
                chicken.moveRight();
                break;
            case KeyboardEvent.KEY_UP:
                chicken.moveUp();
                chicken.setCanMove(false);
                break;
            case KeyboardEvent.KEY_DOWN:
                chicken.moveDown();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        chicken.setCanMove(true);
    }

    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }

}
