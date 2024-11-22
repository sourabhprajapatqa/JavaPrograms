package package2;

import java.util.Map;

public class Assign72 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "John");
        studentMap.put(102, "Alice");
        studentMap.put(103, "Bob");
        studentMap.put(104, "Charlie");

        // i) Check if specific roll number and name exist in map & print if exists
        int rollNoToCheck = 102;
        String nameToCheck = "Alice";

        if (studentMap.containsKey(rollNoToCheck) && studentMap.get(rollNoToCheck).equals(nameToCheck)) {
            System.out.println("Roll number " + rollNoToCheck + " and name " + nameToCheck + " exist in the map.");
        } else {
            System.out.println("Roll number " + rollNoToCheck + " and name " + nameToCheck + " do not exist in the map.");
        }
    }
}
