/*
 * GamePlay.java
 *
 * Version: $Id$
 *
 * Revisions: $Log$
 */

/**
 * Description - The class works on desingning a game based on the given descriptions.
 *
 * @author Author name
 * @author Dibyanshu Chatterjee
 * @author Muskan Mall
 */

public class GamePlay extends Thread {
    int number;
    static int count = 100; //keeping static variable to do a static decrement
    static final Object obj = new Object();//static object to keep a track of synchronization
    GamePlay(int number) {
        this.number = number;
    }

    public void check() throws InterruptedException {
        /*
         *
         * The check function is being used to check the counting of number of marbles picked
         * or not.
         *
         */
        int marbles = 0;
        while (count > 0) {
            sleep((int) (10 * Math.random()));

            synchronized (obj) {
                if (count > 0) {
                    marbles++;
                    count--;
                } else {
                    break;
                }
            }
        }
        System.out.println("Player " + number + " has " + marbles + " marbles ");
    }
    @Override
    public void run() {
        try {
            check();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
