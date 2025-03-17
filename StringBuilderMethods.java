public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Programming");

        sb.insert(5, " is Awesome");  // Insert at index 5
        sb.replace(0, 4, "Python");   // Replace "Java" with "Python"
        sb.delete(13, 21);            // Delete "Awesome"

        System.out.println("Final String: " + sb);
    }
}
