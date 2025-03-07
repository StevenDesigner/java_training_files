import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Taking input
        
        System.out.println("Length of the string: " + input.length()); // Finding length
        
        scanner.close();
    }
}
