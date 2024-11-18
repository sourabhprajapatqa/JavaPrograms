public class Assign37 {
    //WAP to compare the String by using the method equalIgnoreCase.

    public static void main(String[] args) {

        String str1 = "Sourabh";
        String str2 = "sourabH";

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("String is equal");
        }
        else
            System.out.println("String is not equal");
    }
}
