public class Assign43
{
    public static void main(String[] args) {
        //WAP from the given string input replace all the entire numerics with Nothing.
        //
        //Example: String name= "My home is near to sector 2 Patna 4";

        String name= "My home is near to sector 2 Patna 4";
        String name1 = name.replaceAll("[0-1]", "");
        name = name1;
        System.out.println(name);
    }
}
