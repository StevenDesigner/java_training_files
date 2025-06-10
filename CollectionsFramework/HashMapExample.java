package CollectionsFramework;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("John", 85);
        studentMarks.put("Emma", 92);

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
