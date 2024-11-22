package package2;

import java.util.ArrayList;

public class Assign60 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("List after adding elements: " + list);

        list.remove("Banana");
        System.out.println("List after removing 'Banana': " + list);

        System.out.println("Size of list: " + list.size());

        boolean containsCherry = list.contains("Cherry");
        System.out.println("Does list contain 'Cherry'? " + containsCherry);

        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
