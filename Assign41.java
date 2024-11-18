public class Assign41 {
    public static void main(String[] args) {

        String name = "kv no 2";

        // Replacing all alphabets (A-Z, a-z) with an empty string
        String result = name.replaceAll("[a-zA-Z]", "");

        // Output the result
        System.out.println("Original String: " + name);
        System.out.println("String after removing alphabets: " + result);
    }
}
