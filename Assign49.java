public class Assign49 {
    //WAP where the your name is like "RAM" and print the output like:
    //R
    //A
    //M
    //And Print the second output as like:
    //M
    //A
    //R

    public static void main(String[] args) {
        String name = "RAM";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));  // Prints each character on a new line
        }

        System.out.println();  // For space between two outputs

        // Print name in reverse order (vertically)
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));  // Again, prints each character on a new line
        }
    }
    }
