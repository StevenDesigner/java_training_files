package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SmallProblems {

    public static void main(String[] args) {
        int[] arr = {1, 1,3,4, 4, 5};
        // reverse(arr);
        // System.out.println(Arrays.toString(arr));

        // System.out.println(palindromchk("madam"));
        // System.out.println(max(arr));
        // freequency(arr);
        // System.out.println(targetCheck(arr, 10));
        removeDuplicatesTwopointer(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1, temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static boolean palindromchk(String word) {
        int i = 0, j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int elem : arr) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public static void freequency(int[] arr) {

        Map<Integer, Integer> count = new HashMap<>();

        for (int elem : arr) {
            count.put(elem, count.getOrDefault(elem, 0) + 1);
        }

        for (int elem : count.keySet()) {
            System.out.println(elem + " --> " + count.get(elem));
        }

    }

    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> arr) {
        return new ArrayList<>(new HashSet<>(arr));
    }

    public static boolean targetCheck(int[] arr, int target) {
        //can only be used in sorted arrays
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return false;

    }


    public static void moveZeroes(int[] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }

        }
    }

    public static void removeDuplicatesTwopointer(int[] arr){
        int i=0;
        for(int j=1; j<arr.length; j++){

            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

    }
}
