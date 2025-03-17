public class NumberCheckMethod {
    static boolean isEven(int num) {
        return num % 2 == 0; // If remainder is 0, it's even
    }

    public static void main(String[] args) {
        System.out.println(isEven(10)); // true
        System.out.println(isEven(7));  // false
    }
}
