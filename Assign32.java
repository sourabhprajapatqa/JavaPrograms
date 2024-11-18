import java.lang.reflect.Array;
import java.util.Arrays;

public class Assign32 {
    public static void main(String[] args) {
        int [] A = { 10,20,30,40,50};
        int [] B = { 10,20,30,40,50};

        boolean result = Arrays.equals(A,B);

        if(result==true)
        {
            System.out.println("Given array is equal");
        }

        else

            System.out.println("Given array is not equal");
    }
    }
    //Write a program to check whether the two given arrays are equal or not.


