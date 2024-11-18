import java.lang.reflect.Array;
import java.util.Arrays;

public class Assign35 {
    //WAP to check the given two  strings are anagram or not.

    public static void main(String[] args) {
        // Strings ko lower case mein convert kar lo taaki case-sensitive na ho
        String str1 = "Sourabh",str2 = "Sourabh";
         str1.toLowerCase();
         str2.toLowerCase();

        // Agar dono strings ka length alag hai, to wo anagram nahi ho sakti
        if (str1.length() != str2.length()){
            System.out.println("String is not anagram");
        }

        // Strings ko character array mein convert karo
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Dono arrays ko sort karo
   //     Arrays.sort(charArray1);
    //    Arrays.sort(charArray2);

      System.out.println(" String is anagram :" + Arrays.equals(charArray1, charArray2));  ;
    }


}
