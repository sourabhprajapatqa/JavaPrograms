package package2;

import java.util.HashMap;
import java.util.Map;

public class Assign71 {
    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();

        fruitMap.put("Apple", 50);
        fruitMap.put("Banana", 30);
        fruitMap.put("Cherry", 20);
        fruitMap.put("Date", 40);

        // i) Retrieve and print fruit quantity
        String fruitToCheck = "Banana";
        if (fruitMap.containsKey(fruitToCheck)) {
            System.out.println(fruitToCheck + " quantity: " + fruitMap.get(fruitToCheck));
        } else {
            System.out.println(fruitToCheck + " is not in the map.");
        }

        // ii) Remove a fruit
        String fruitToRemove = "Cherry";
        if (fruitMap.containsKey(fruitToRemove)) {
            fruitMap.remove(fruitToRemove);
            System.out.println(fruitToRemove + " has been removed.");
        } else {
            System.out.println(fruitToRemove + " is not in the map.");
        }

        // iii) Print all fruits with their quantities
        System.out.println("\nFruits and their quantities:");
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
