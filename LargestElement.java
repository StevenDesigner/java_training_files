public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {25, 14, 85, 90, 34, 67};
        int max = numbers[0];  // Assume first element is the largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest number: " + max);
    }
}
