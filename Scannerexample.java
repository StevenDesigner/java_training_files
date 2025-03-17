
import java.util.Scanner;

public class Scannerexample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hi ");

        String name = sc.nextLine();
        System.out.println("Hi " + name);

        int num = sc.nextInt();

        System.out.println("Hi " + name + num);
    }
}
