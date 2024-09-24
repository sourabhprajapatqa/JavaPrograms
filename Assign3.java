package finalAssignments;

public class Assign3 {
	
	static void sum() {
	
		int a =10;
		int b = 20;
		int sum = a +b;
		System.out.println(sum);
	}
	
    static	void sum(int a, int b) {
		
    	
		int sum = a -b;
		System.out.println(sum);
    	
	}
    
    static	void sum(int a, int b, int c) {
    	
		int sum = a +b - c;
		System.out.println(sum);
 		
	}
    
    static	void sum(int a, int b, int c, String d) {
    
		int sum = a +b + c;
		System.out.println(sum + d);
 	}
	
   static	void sum(int a, int b, int c, String d, double f) {

	   int sum = a +b + c;
		System.out.println(sum + d + f);
   }
   
   static	void sum(int a, int b, int c, String d, boolean f) {
	   int sum = a +b + c;
		System.out.println(sum + d + f);
	   
	}

	public static void main(String[] args) {
		
		System.out.println("result is below");
		sum();
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,"sourabh");
		sum(10,20,30,"sourabh", 1.1);
		sum(10,20,30,"sourabh", true );
		

	}

}
