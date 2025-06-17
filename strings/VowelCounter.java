import java.util.Scanner;

public class VowelCounter {

    // Method to count vowels in a string
    public static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to count vowels: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}
