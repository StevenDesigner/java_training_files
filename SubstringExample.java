import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter starting index: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending index: ");
        int end = scanner.nextInt();

        if (start >= 0 && end <= input.length() && start < end) {
            System.out.println("Extracted Substring: " + input.substring(start, end));
        } else {
            System.out.println("Invalid indexes!");
        }

        scanner.close();
    }
}
