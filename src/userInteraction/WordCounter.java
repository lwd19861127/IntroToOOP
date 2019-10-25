package userInteraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void openFile() throws FileNotFoundException {
        int wordCounter = 0;

        File f = new File("vancouver.txt");
        Scanner in = new Scanner(f);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            // "Hello World".split(" ") -> arr {"Hello", "World"}
            wordCounter += line.split(" ").length;
        }
        System.out.println("The file contains " + wordCounter + " words.");
    }
}
