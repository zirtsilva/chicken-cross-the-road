package org.academiadecodigo.floppybirds.chicken;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class ControlsMainScreen implements KeyboardHandler {

    private Keyboard keyboard;
    private Game game;


    public void init() {

        keyboard = new Keyboard(this);

        KeyboardEvent pressedSpace = new KeyboardEvent();
        pressedSpace.setKey(KeyboardEvent.KEY_SPACE);
        pressedSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pressedSpace);

        KeyboardEvent pressedI = new KeyboardEvent();
        pressedI.setKey(KeyboardEvent.KEY_I);
        pressedI.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pressedI);

        KeyboardEvent pressedEsc = new KeyboardEvent();
        pressedEsc.setKey(KeyboardEvent.KEY_ESC);
        pressedEsc.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(pressedEsc);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                game.hideScreens();
                break;
            case KeyboardEvent.KEY_I:
                game.showInstructions();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void setGame(Game game) {
        this.game = game;
    }


}

