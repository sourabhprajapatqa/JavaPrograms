package finalAssignments;

import java.util.Scanner;

public class Assign8 {

	public static void main(String[] args) {
		// Area of square
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side");
		int side = sc.nextInt();
		
		int area = side * side;
		
		System.out.println("Area of square " + area);
		sc.close();

	}

}
