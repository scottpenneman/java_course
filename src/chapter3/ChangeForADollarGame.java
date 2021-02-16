package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {

        System.out.println("!!!!!Change for A Dollar!!!!!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies would you like?:");
        double penniesValue = .01 * scanner.nextDouble();
        System.out.println("How many nickels would you like?:");
        double nickelsValue = .05 * scanner.nextDouble();
        System.out.println("How many dimes would you like?:");
        double dimesValue = .10 * scanner.nextDouble();
        System.out.println("How many quarters would you like?:");
        double quartersValue =  .25 * scanner.nextDouble();

        double coinTotal = penniesValue + nickelsValue + dimesValue + quartersValue;

        if (coinTotal == 1.00) {
            System.out.println("Congratulations, you won!");
        } else if (coinTotal < 1.00) {
            double lowerDifference = 1.00 - coinTotal;
            System.out.println("You were under by " + lowerDifference + " cents.");
        } else {
            double higherDifference = coinTotal - 1.00;
            System.out.println("You were over by " + higherDifference + " cents.");
        }

    }

}
