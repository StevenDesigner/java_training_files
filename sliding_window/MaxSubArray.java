package sliding_window;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = findMaxSum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
    //m =9
    // w =5
    // {2, 1, 5, 1, 3, 2};
    //                  |
    private static  int findMaxSum(int[] arr, int k) {
        int windowSum = 0, maxSum = 0;

        for (int i = 0; i < arr.length; i++) {

            windowSum = windowSum + arr[i];

            if (i >= k - 1) {
                maxSum=Math.max(windowSum, maxSum);
                windowSum = windowSum - arr[i - (k - 1)];
            }

        }

        return maxSum;

    }
}
