package userInteraction;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Math.random(): returns double from 0.0 <=  < 1.0
        // 1. Generate a random number form 1 to 100
        int magicNumber = (int)(Math.random() * 100) + 1;
        boolean isCorrect = false;

        System.out.println("I have generated a random number between 1 to 100.");
        System.out.println("Try to guess the number!");

        // 2.Create a Scanner object to get user input.
        Scanner in = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left.");
            int input = in.nextInt(); // get user input as int
            if (magicNumber == input) {
                isCorrect = true;
                System.out.println("Correct! The magic number is " + magicNumber);
                break;
            } else if (magicNumber > input) {
                System.out.println("The magic number is greater than " + input);
            } else if (magicNumber < input) {
                System.out.println("The magic number is less than " + input);
            }
        }
        if (!isCorrect) {
            System.out.println("Game Over... You failed!");
            System.out.println("The magic number was " + magicNumber);
        }
    }
}
