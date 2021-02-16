package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    /*
     * NESTED IFS:
     * To qualify for a loan, a person must make at least $30,000
     * and have been working at their current job for at least 2 years.
     */

    public static void main(String[] args) {

//        Initialize what we know
        int requiredSalary = 30000;
        int requiredTenure = 2;

//        Get what we don't
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your salary?:");
        double userSalary = scanner.nextDouble();

        System.out.println("How long have you worked at your current job?:");
        double userTenure = scanner.nextDouble();
        scanner.close();

//        Make decision
        if(userSalary >= requiredSalary) {
            if(userTenure >= requiredTenure) {
                System.out.println("Congratulations, hopefully the loan doesn't have too high of an interest rate!");
            } else {
                System.out.println("Sorry, you must have worked at your current job for " + requiredTenure + " years.");
            }
        }
        else {
            System.out.println("We're sorry, you must earn at least $" + requiredSalary + " to qualify for a loan.");
        }

    }

}
