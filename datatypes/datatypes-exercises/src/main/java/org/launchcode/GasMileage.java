package org.launchcode;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = input.nextDouble();

        System.out.println("How much gas have you used?");
        Double gasConsumed = input.nextDouble();

    }
}
