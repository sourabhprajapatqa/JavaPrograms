public class Assign18 {
    static class A {

        A(String name){
            // Constructor of class A
            System.out.println("Constructor of class A called with name: " + name);
        }
    }

    static class B extends A {
        B(int marks){
            super("sourabh"); // Calling A's constructor with a String argument
            System.out.println("Constructor of class B called with marks: " + marks);
        }
    }

   static  class C extends B {
        C(){
            super(100); //Passing an int to B's constructor
            System.out.println("Constructor of class C called");
        }
    }
    public static void main(String[] args) {
        // Create an instance of class C to trigger the constructor chain
        new C();
    }

}
