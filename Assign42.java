public class Assign42 {
    public static void main(String[] args) {
        String name = "I am The Boss";

        // Replace all capital letters with nothing
        String result = name.replaceAll("[A-Z]", "");

        System.out.println("Original String: " + name);
        System.out.println("Modified String: " + result);
    }
    }

