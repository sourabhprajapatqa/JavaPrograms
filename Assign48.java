public class Assign48 {
    //WAP from the given string replace the space with underscore.
    //
    //Example: String input= "My name is Shyam";
    public static void main(String[] args) {
        String input= "My name is Shyam";
       String name = input.replaceAll(" ","_");
        System.out.println(name);
    }

}
