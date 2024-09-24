package finalAssignments;

public class Assignment2 {
	
	void sum(){
		int a =10;
		int b = 20;
		int sum = a +b;
		System.out.println(sum);
	}
	
	void min(){
		int a =10;
		int b = 20;
		int sum = a -b;
		System.out.println(sum);
	}
	
	void mod(){
		int a =10;
		int b = 20;
		int sum = a%b;
		System.out.println(sum);
	}
	
	void divide(){
		int a =10;
		int b = 20;
		int sum = a/b;
		System.out.println(sum);
	}
	void multi(){
		int a =10;
		int b = 20;
		int sum = a*b;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		
		Assignment2 a1 = new Assignment2();
		a1.sum();
		a1.min();
		a1.mod();
		a1.divide();
		a1.multi();
		}

	}


