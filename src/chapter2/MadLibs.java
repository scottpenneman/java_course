package chapter2;

import java.util.Scanner;

public class MadLibs {

//    Create a program that asks a user for a season of the year, then a whole number, then an adjective. Use the input to
//    complete the sentence below then output the result: "On a [adjective] [season of the year] day, I drink a minimum of
//    [whole number] cups of coffee."

    public static void main(String[] args) {

        System.out.println("Enter a season:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter a whole number:");
        int wholeNumber = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber +
                " cups of coffee.");
        scanner.close();

    }

}
