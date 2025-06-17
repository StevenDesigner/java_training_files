package sliding_window;

import java.util.HashSet;

public class LongestSubString {
     public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }

     private static int lengthOfLongestSubstring(String input) {
        HashSet<Character> set= new HashSet<>();
        int left=0,maxLenth=0;

        for(int right=0; right<input.length();right++){

            while (set.contains(input.charAt(right))) {
               set.remove(input.charAt(left));
               left++;
            }
            set.add(input.charAt(right));

            maxLenth=Math.max(maxLenth, right-left+1);
        }
        return maxLenth;
     }
}
