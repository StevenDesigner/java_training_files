package CollectionsFramework;

// return a list of numbers that appear more than once
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Duplicates using map: " + findDuplicates(nums));
        System.out.println("Duplicates using set: " + findDuplicatesUsingSet(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> elem : countMap.entrySet()) {
            if (elem.getValue() > 1) {
                duplicates.add(elem.getKey());
            }
        }
        return duplicates;
    }

    public static List<Integer> findDuplicatesUsingSet(int[] nums) {

        Set<Integer> check = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            if (!check.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }

}
    //rewritten logic using hashset
