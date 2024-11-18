public class Assign36 {
    //WAP to find out the alphabates char, digits, spaces, and special char from the given strings. in java


    public static void main(String[] args) {
        String str1 = "I Love#$%iNDIA#";

                int aplphabets = 0, spaces =0 , digits = 0, special =0;

        for(int i=0; i< str1.length();i++)        {
            char ch = str1.charAt(i);


        if(Character.isAlphabetic(ch)){
            aplphabets++;
        } else if (Character.isDigit(ch)) {
            digits++;
        } else if (Character.isWhitespace(ch)) {
            spaces++;
        } else{
           special++;
        }
    }
    }


}
