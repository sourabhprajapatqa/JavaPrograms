package package2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign68 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(5);
        numbers.add(15);
        numbers.add(35);
        numbers.add(10);

        System.out.println("List before sorting: " + numbers);

        Collections.sort(numbers);  // Sorting the list in ascending order

        System.out.println("List after sorting: " + numbers);
    }
}
