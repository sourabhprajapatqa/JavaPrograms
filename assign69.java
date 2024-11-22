package package2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class assign69 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
