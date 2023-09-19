package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD mixCD = new CD(250, 200, 500, 0);

        mixCD.spinDisc();
        mixCD.writeData("Song 1", 10);
        mixCD.writeData("Song 2", 8);
    }
}