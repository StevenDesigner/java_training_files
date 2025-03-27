package games;

import java.util.Scanner;
import games.utils.GameHelper;  // Importing a class from a subpackage

public class GuessTheNumber {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        GameHelper.displayWelcome();
        while (true) {
            System.out.print("Enter your guess (1-10) or 'c' to close: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("c")) {
                System.out.println("Closing the game. Goodbye!");
                break;
            }

            int userGuess = Integer.parseInt(input);
            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Please enter a number between 1 and 10.");
                continue;
            }
            GameHelper.guessNumber(userGuess);

        }

        sc.close();
    }
}