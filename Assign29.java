public class Assign29 {
    public static void main(String[] args) {
        int [] ar ={10,20,30,40,20};
        for(int i=0; i<ar.length; i++){
            for(int j=i+1; j<ar.length; j++){
                if(ar[i]==ar[j]){
                    System.out.println("Duplicate found: " + ar[i]);
                }
            }

        }



    }
}
