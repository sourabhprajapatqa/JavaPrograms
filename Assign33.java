import java.util.Arrays;
import java.util.Scanner;

public class Assign33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " elements:");
       for (int i=0; i<size; i++) {
           array[i] = scanner.nextInt();
       }
// Display the array elements
           System.out.println("You entered:");
           for(int i=0; i<size; i++){
               System.out.println(array[i]);

           }
        System.out.println(Arrays.toString(array));
        scanner.close();
}


    }

