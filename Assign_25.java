public class Assign_25 {
    //Write a program on reverse a string.

    public static void main(String[] args) {
        String s = "Sourabh";
        String rev = "";

        for(int i=s.length()-1; i>=0; i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
