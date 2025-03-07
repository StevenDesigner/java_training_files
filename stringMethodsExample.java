public class stringMethodsExample {
    public static void main(String[] args) {
        String str = "  Java Programming  ";
        
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("To Uppercase: " + str.toUpperCase());
        System.out.println("To Lowercase: " + str.toLowerCase());
        System.out.println("Trimmed String: " + str.trim());
        System.out.println("Substring (5, 14): " + str.substring(5, 14));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Replaced 'a' with 'o': " + str.replace('a', 'o'));
    }
}
