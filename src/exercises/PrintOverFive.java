package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintOverFive {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("We are going to have you type 5 words. Each word that is exactly 5 characters will be printed at the end.");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + ": ");
            String word = in.next();
            words.add(word);
        }
        System.out.println("\nBelow are the words that were exactly 5 characters long.");
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
