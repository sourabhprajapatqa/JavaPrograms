public class Assign_44 {
    //WAP to check from the given string exact letters count.
    //
    //Example: String name= "kv no 2";

    public static void main(String[] args) {
        String name = "kv no 2";
        int count = 0;


        for(int i=0; i <name.length(); i++){
            if(Character.isLetter(name.charAt(i))){
                count++;
            }


        }
        System.out.println("Count of the string " + name + " is: " + count);


    }
}
