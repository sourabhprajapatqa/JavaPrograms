package package2;

import java.util.Scanner;

public class Assign58 {
    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            int choice = scanner.nextInt();

            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Addition: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Subtraction: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Multiplication: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Division: " + result);
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            scanner.close();
        }
    }

}
