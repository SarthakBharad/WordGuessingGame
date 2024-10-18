package games;

import java.util.Scanner;

public class WordGuessingGame {

    public static void main (String[] args) {

        String word = "Distributed";  // Fixed typo in the word
        boolean wordGuessed = false;
        int position = 0;
        Scanner scanner = new Scanner(System.in);

        while (!wordGuessed) {
            System.out.println("please enter a character:");
            char c = scanner.next().charAt(0);

            if (c == word.charAt(position)) {

                if (position == word.length() - 1) {
                    System.out.println("you guessed the word!");
                    System.out.println("the word is: " + word);
                    wordGuessed = true;
                }
                else {
                    System.out.println("this is correct but, there are more characters to guess...");
                    position++;
                }
            }
            else {
                System.out.println("oops! that is wrong, please try again...");
            }
        }
    }
}