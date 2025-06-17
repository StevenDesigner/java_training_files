import java.util.Scanner;

public class LongestCommonPrefix {

    // Method to find longest common prefix
    public static String longestCommonPrefix(String[] strs) {
       if(strs==null || strs.length ==0) return " ";

       String prefix=strs[0];
       for(int i=0; i<strs.length; i++){

        while(strs[i].indexOf(prefix) !=0){
            prefix=prefix.substring(0,prefix.length()-1);
        }

       }
       return prefix;

    }

    // Main method to test the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of strings:");
        int n = Integer.parseInt(scanner.nextLine());

        String[] inputStrings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            inputStrings[i] = scanner.nextLine();
        }

        String prefix = longestCommonPrefix(inputStrings);
        System.out.println("Longest common prefix: " + prefix);

        scanner.close();
    }
}
