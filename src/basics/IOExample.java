package basics;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        // Write a program to say hello in each language!
        // en - English
        // br - Portuguese
        // mx - Spanish
        // ir - Farsi
        // jp - Japanese
        // kr - Korean
        // ph - Tagalog

        // Getting input using Scanner
        // 1. creat a new Scanner Object
        Scanner in = new Scanner(System.in);
        // 2. get the next line as a string
        while (true) {
            System.out.println("Choose the language:(en, br, mx, cn, ir, jp, kr, ph)");
            String input = in.nextLine();
            if (input.equals("en")) {
                System.out.println("Hello");
            } else if (input.equals("br")) {
                System.out.println("Oi");
            } else if (input.equals("mx")) {
                System.out.println("Hola");
            } else if (input.equals("cn")) {
                System.out.println("你好");
            } else if (input.equals("ir")) {
                System.out.println("Salam");
            } else if (input.equals("jp")) {
                System.out.println("こんにちは");
            } else if (input.equals("kr")) {
                System.out.println("안녕하세요");
            } else if (input.equals("ph")) {
                System.out.println("Hoy");
            }
        }
    }
}
