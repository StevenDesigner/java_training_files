import java.util.Scanner;

public class AppendString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);
        sb.append(" World"); // Appending " World" to input

        System.out.println("Modified String: " + sb);

        scanner.close();
    }
}
