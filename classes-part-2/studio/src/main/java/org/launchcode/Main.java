package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Date todaysDate = new Date();

        MenuItem burger = new MenuItem(2.99, "Burger", "Entree", true);
        System.out.println(burger);


    }
}
