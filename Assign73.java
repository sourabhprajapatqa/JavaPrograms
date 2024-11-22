package package2;

public class Assign73 {
    public static void main(String[] args) {
        try {
            // Simulating different types of exceptions

            // ArithmeticException
            int result = 10 / 0;

            // NullPointerException
            String str = null;
            System.out.println(str.length());

            // ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            arr[10] = 100;

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero (ArithmeticException).");
        } catch (NullPointerException e) {
            System.out.println("Error: Trying to access an object reference that is null (NullPointerException).");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds (ArrayIndexOutOfBoundsException).");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        }
    }
}
