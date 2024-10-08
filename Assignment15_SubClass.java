package finalAssignments;

public class Assignment15_SubClass extends Assignment15_ParentClass {

	int marks;
    String name;

    // Constructor to initialize variables
    public Assignment15_SubClass() {
        marks = 250;
        name = "Sourabh";
    }

    public static void main(String[] args) {
        Assignment15_SubClass obj = new Assignment15_SubClass();
        // Calling the login method from the parent class
        int result = obj.login(obj.marks, obj.name);

        System.out.println("Name: " + obj.name);
        System.out.println("Marks: " + result); // Using the return value of the login method
    }

} 

