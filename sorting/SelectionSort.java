package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 5, 7, 2, 0};

        selectionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // Swap arr[i] with arr[minIndex]
            int tempValue = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tempValue;
        }
    }
}
