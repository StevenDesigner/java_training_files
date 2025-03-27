package games.utils;  // This class is in "games.utils" subpackage

public class GameHelper {
    public static void displayWelcome() {
        System.out.println("********* Welcome to GuessTheNumber! *********");
    }


    public static void guessNumber(int userGuess) {
        int randomNumber = (int) (Math.random() * 10) + 1; // Generates a number between 1 and 10
        System.out.println("Random Number: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Correct!");
        } else {
            System.out.println("Try Again!");
        }
    }
}

