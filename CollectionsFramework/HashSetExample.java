package CollectionsFramework;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate, will not be added

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
