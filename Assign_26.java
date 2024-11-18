public class Assign_26 {
    public static void main(String[] args) {
        //Write a program where to check the given strings are palindrome or not.
        String s = "Level";

        System.out.println("value of s is " + s);
        String output = "";
        for(int i=s.length()-1; i>=0; i--){
            output = output + s.charAt(i);

        }
        System.out.println("value of output is " + output);
        if(s.toLowerCase().equals(output.toLowerCase()))
        {
            System.out.println("String is pallindrome");
        }
        else
            System.out.println("String is not pallindrome");
    }


}
