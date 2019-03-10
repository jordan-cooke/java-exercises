package exercises;

import java.util.Scanner;

public class alice {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        alice = alice.toLowerCase();
        System.out.print("Type word to see if it's in Alice string: ");
        String userInput = in.nextLine();
        userInput = userInput.toLowerCase();
        if (alice.contains(userInput) == true) {
            System.out.println("Yep, that words in there.");
        } else {
            System.out.println("Nope. That words not in there.");
        }
    }
}
