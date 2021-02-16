package chapter3;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {

//        Get test score
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was your test score?:");
        double testScore = scanner.nextDouble();

//        Determine letter grade
        char grade;
        if (testScore < 60) {
            grade = 'F';
        } else if (testScore < 70) {
            grade = 'D';
        } else if (testScore < 80) {
            grade = 'C';
        } else if (testScore < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);




    }
}
