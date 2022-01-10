/*
 * Test.java
 *
 * Version: $Id$
 *
 * Revisions: $Log$
 */

/**
 * Description - The class works on Testing the main class
 *
 * @author Author name
 * @author Dibyanshu Chatterjee
 * @author Muskan Mall
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new GamePlay(i).start();
        }
    }
}
