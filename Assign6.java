package finalAssignments;

import java.util.Scanner;

public class Assign6 {
	
	static double Pi = 3.14;

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter radius");
         double radius = sc.nextDouble();
         
         double circumference = 2 * Pi * radius;
         System.out.println("Circumference of circle is " + circumference);
         
         sc.close();
	}

}
