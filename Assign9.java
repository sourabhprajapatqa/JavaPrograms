package finalAssignments;

import java.util.Scanner;

public class Assign9 {

	public static void main(String[] args) {
		// Area of rectangle
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Width");
		int width = sc.nextInt();
		
		System.out.println("Enter Length");
		int length = sc.nextInt();
		
		int area = width * length;
		
		System.out.println("Area of rectangle " + area);
		sc.close();
	}

}
