// Import (Optional)
import java.util.Scanner;

// Class (Mandatory)
public class completeprogram {

    // Main Method (Mandatory)
    public static void main(String[] args) {

        // Print Statement
        System.out.println("Hello, Java!");

        try (// Using Scanner for input (Example)
        Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Welcome, " + name + "!");
        }
    }
}
