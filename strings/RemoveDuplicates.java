import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String s) {
        Set<Character> seen= new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            seen.add(c);
        }
        StringBuilder strin= new StringBuilder();

        for (Object c : seen) {
            strin.append(c);
        }
        return strin.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }
}

