package org.academiadecodigo.floppybirds.chicken;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        while (true) {

            Game g = new Game();
            g.init();

            ControlsMainScreen c = new ControlsMainScreen();
            c.init();
            c.setGame(g);

            try {
                g.start();
            } catch (InterruptedException e) {
                System.out.println("No way!!");
            }
            Thread.sleep(6285);
        }
    }
}
