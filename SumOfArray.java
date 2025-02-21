public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : numbers) {  // Enhanced for loop
            sum += num;
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
