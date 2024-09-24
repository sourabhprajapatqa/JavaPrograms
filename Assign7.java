package finalAssignments;

import java.util.Scanner;

public class Assign7 {

	public static void main(String[] args) {
		//Area of triabngle

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		float base = sc.nextFloat();
		System.out.println("Enter Perpendicular");
		float perpendicular = sc.nextFloat();
		float area = 0.5f *  base * perpendicular;
		
		System.out.println("Area of triangle " + area);
		sc.close();
	}

}
