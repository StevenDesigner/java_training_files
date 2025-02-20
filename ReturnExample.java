public class ReturnExample {
    public static void main(String[] args) {
        int result = multiply(5, 4);
        System.out.println("Multiplication: " + result);
    }

    static int multiply(int a, int b) {
        return a * b;  // Returns the product of a and b
    }
}
