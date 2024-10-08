package finalAssignments;

public class Assign17_ClassA {
	
	String Cartype;
	
	Assign17_ClassA(){
		this.Cartype = Cartype;
		System.out.println("Vehicle constructor called: " + Cartype);
	}


class ClassB extends Assign17_ClassA {
		
	}
	
	
class ClassC extends ClassB {
	
}


class ClassD extends ClassC{
	
	
	
	public static void main(String[] args) {
		
		new Assign17_ClassA();
		
	}
	
}


}
