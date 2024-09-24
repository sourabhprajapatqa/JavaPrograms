package finalAssignments;

public class Assign4 {
	void sum() {
		
		int a =10;
		int b = 20;
		int sum = a +b;
		System.out.println(sum);
	}
	
    void sum(int a, int b) {
		
    	
		int sum = a -b;
		System.out.println(sum);
    	
	}
    
    void sum(int a, int b, int c) {
    	
		int sum = a +b - c;
		System.out.println(sum);
 		
	}
    
    void sum(int a, int b, int c, String d) {
    
		int sum = a +b + c;
		System.out.println(sum + d);
 	}
	
   void sum(int a, int b, int c, String d, double f) {

	   int sum = a +b + c;
		System.out.println(sum + d + f);
   }
   
   void sum(int a, int b, int c, String d, boolean f) {
	   int sum = a +b + c;
		System.out.println(sum + d + f);
	   
	}

	public static void main(String[] args) {
		
		System.out.println("result is below");
		Assign4 a1 = new Assign4();
		a1.sum();
		a1.sum(10,20);
		a1.sum(10,20,30);
		a1.sum(10,20,30,"sourabh");
		a1.sum(10,20,30,"sourabh", 1.1);
		a1.sum(10,20,30,"sourabh", true );
		

	}


	
}
