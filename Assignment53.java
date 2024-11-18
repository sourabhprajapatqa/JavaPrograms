class Assign53 {
    public void showMessage() {
        System.out.println("This is the message from Assign53.");
    }
}

// Interface
interface MyInterface {
    void myMethod();
}

// Subclass that extends Assign53 and implements MyInterface
class SubClass extends Assign53 implements MyInterface {
    // Implementing the method from MyInterface
    public void myMethod() {
        System.out.println("This is the implemented method from MyInterface.");
    }
    public static void main(String[] args) {
        // Create an object of SubClass
        SubClass obj = new SubClass();

        // Calling methods
        obj.showMessage();  // Method from Assign53
        obj.myMethod();     // Method from MyInterface
    }
}



