public class Factorial {
    static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + getFactorial(5));  // 120
        System.out.println("Factorial of 3: " + getFactorial(3));  // 6
    }
}
