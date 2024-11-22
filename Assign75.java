package package2;

public class Assign75 {
    private String name;
    private int age;

    // Constructor to initialize Assign75 object
    public Assign75(String name, int age) {
        this.name = name;  // Using 'this' to refer to the current instance variable
        this.age = age;    // Using 'this' to refer to the current instance variable
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Employee Name: " + this.name);  // 'this' refers to the current instance variable
        System.out.println("Employee Age: " + this.age);    // 'this' refers to the current instance variable
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Assign75 employee = new Assign75("Alice", 30);  // Using Assign75 instead of Employee
        employee.displayInfo();  // Display employee details
    }
}
