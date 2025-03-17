import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuffer sb = new StringBuffer(input);
        sb.reverse(); // Reversing the string

        System.out.println("Reversed String: " + sb);

        scanner.close();
    }
}
