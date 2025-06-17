package sliding_window;

public class KadanesAlog {
    public static void main(String[] args) {
        // Example input
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum subarray sum is: " + result);
        // Output: 6 (from subarray [4, -1, 2, 1])
    }

    private static int maxSubArray(int[] nums) {
        int currentSUm=0, maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int temp= currentSUm + nums[i];
            if(temp>nums[i]){
                currentSUm= temp;
            }else{
                currentSUm=nums[i];
            }
            //--------
            maxSum=Math.max(maxSum, currentSUm);
        }

        return maxSum;
    }


}
