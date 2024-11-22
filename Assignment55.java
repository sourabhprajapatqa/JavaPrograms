package package2;

class Assignment55 {

    // Public access specifier
    public String publicVar = "Public Variable";

    // Private access specifier
    private String privateVar = "Private Variable";

    // Protected access specifier
    protected String protectedVar = "Protected Variable";

    // Default (Package-Private) access specifier
    String defaultVar = "Default Variable";

    // Method to display values of the variables
    void displayValues() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

// Class within the same package to access the variables
public class TestAccess {
    public static void main(String[] args) {
        // Creating an object of Assignment55 class
        Assignment55 obj = new Assignment55();

        // Accessing the variables from Assignment55 class
        System.out.println("Accessing Variables from Same Package:");
        System.out.println("Public Variable: " + obj.publicVar);  // Accessible
        // System.out.println("Private Variable: " + obj.privateVar);  // Not Accessible (will cause error)
        System.out.println("Protected Variable: " + obj.protectedVar);  // Accessible
        System.out.println("Default Variable: " + obj.defaultVar);  // Accessible

        // Calling the method to display all values
        obj.displayValues();
    }
}
