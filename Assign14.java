package finalAssignments;

public class Assign14 {

	static class A {
		static void display() {
            System.out.println("Inside class A");
        }
		
	};



	static class B extends A {
	static 	void show() {
            System.out.println("Inside class b");
        }
		
		
	}
	
	
	public static void main(String[] args) {
		A.display();
		B.show();
		B.display();
		
		

	}

}
