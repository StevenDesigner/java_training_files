package games;

import java.util.Scanner;

public class RockPaperScissors {
    static void playGame(String userChoice) {
        String[] options = {"Rock", "Paper", "Scissors"};
        String computerChoice = options[(int) (Math.random() * 3)]; // Random choice

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a Draw!");
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rock, Paper, or Scissors: ");
        String userChoice = sc.next();
        playGame(userChoice);
        sc.close();
    }
}
