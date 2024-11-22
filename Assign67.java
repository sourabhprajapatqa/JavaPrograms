package package2;

import java.util.HashSet;
import java.util.Set;

public class Assign67 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");  // Duplicate element, will not be added

        // Displaying the set
        System.out.println("Set contents: " + set);
    }
}
