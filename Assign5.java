package finalAssignments;

import java.util.Scanner;

public class Assign5 {
	static double pi = 3.14;
	
	
	public static void main(String[] args) {
		// Area if Circle
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int radius = sc.nextInt();
		
	    double area =	pi * radius * radius;
	    System.out.println("area of circle is " + area);
		
	    sc.close();
		
		
		
		

	}

}
