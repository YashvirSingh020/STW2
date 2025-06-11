package Day6;
import java.util.*;

public class MySet {
    public static void main(String[] args) {
        // Create a HashSet of integers
        Set<Integer> set = new HashSet<>();

        // Add elements to the set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate, will not be added

        // Print the set
        System.out.println("Set elements: " + set);

        // Check if an element exists
        if (set.contains(10)) {
            System.out.println("Set contains 10");
        }

        // Remove an element
        set.remove(30);
        System.out.println("After removing 30: " + set);

        // Iterate over the set
        for (int num : set) {
            System.out.println(num);
        }
    }
}
