package package2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assign63 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        ListIterator<String> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
