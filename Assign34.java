public class Assign34
{
    //WAP where the size of the array is 4, and check whether a given value (such as 50) is a part of the array or not.

    public static void main(String[] args) {

        int [] array = {10,20,40,50};

        int searchvalue = 50;

         for(int i=0; i< array.length; i++){
            if(searchvalue==array[i]){
                System.out.println("Value is present in array");
                return;
            }

         }

        System.out.println("Value is  not present in array");


    }


}
