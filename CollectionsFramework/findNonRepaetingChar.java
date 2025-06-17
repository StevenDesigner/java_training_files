package CollectionsFramework;
//Return the first character in a string that doesn't repeat.

import java.util.LinkedHashMap;
import java.util.Map;

public class findNonRepaetingChar {

    public static void main(String[] args) {
        String input = "hidah";
        System.out.println("Non repaet using map: " + findNonRepeat(input));
    }

    public static char findNonRepeat(String input) {

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char oneChar : input.toCharArray()) {
            countMap.put(oneChar, countMap.getOrDefault(oneChar, 0) + 1);
        }

        System.out.println(countMap.entrySet());
        for (Map.Entry<Character, Integer> elem : countMap.entrySet()) {
            if (elem.getValue() == 1) {
                return elem.getKey();
            }
        }

        // for (char elem : input.toCharArray()) {
        //     if (countMap.get(elem) == 1) {
        //         return elem;
        //     }
        // }
        return '0';

    }
}
