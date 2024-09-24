package finalAssignments;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		// Area of circle using Math class
		
		
		
		//Area of circle = 2 * pi * r
		
		areaCircle();	
			
		}
	
		
	 static void areaCircle() {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = s1.nextDouble();
		
		double area = 2 * Math.PI * radius ; 
		
		System.out.println( "Area of Circle is " + area);

	}

}
