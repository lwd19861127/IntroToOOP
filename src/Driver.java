import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String cityName = "Vancouver";
        int point = 10;

        System.out.println("Here's the question." );

        String[] answer = new String[cityName.length()];
        for (int i = 0; i < cityName.length(); i++) {
            answer[i] = "_";
            System.out.print(answer[i]);
        }
        System.out.println();
        System.out.print("Guess a letter:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (cityName.contains(input)) {
            for (int i = 0; i < cityName.length(); i++ ) {
                if (input.equals(cityName.charAt(i))) {
                    answer[i] = input;
                }
            }
        } else {
            if (point > 0) {
                point--;
            }
        }
        if (point > 0) {
            System.out.print("You are guessing: ");
            for (int i = 0; i < cityName.length(); i++) {
                System.out.print(answer[i]);
            }
            System.out.println();
            System.out.println("You have guessed (" + (10-point) + ") wrong letters");
        }

    }
}