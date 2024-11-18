public class Assign47 {
    //WAP to check from the  given string find the letter "s" is present or not.
    //
    //Example: String input= " I'm a simple boy";
    public static void main(String[] args) {
        String input = "I'm a simple boy";
        boolean found = false;

        // Loop to check each character in the string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 's') {
                found = true;
                break; // Stop as soon as 's' is found
            }
        }

        if (found) {
            System.out.println("The letter 's' is present in the string.");
        } else {
            System.out.println("The letter 's' is not present in the string.");
        }
    }
}
