public class Assign39 {
    public static void main(String[] args) {
        //WAP where from the given string replace the City name Gurgaon to Delhi.
        //
        //Example: String name= "I'm in Gurgaon";


        String name= "I'm in Gurgaon";
          String name1 = name.replaceAll("Gurgaon","Delhi");
          name = name1;
          System.out.println(name);

    }
}
