public interface Assign52 {

    void sound();    // Abstract method
    void eat();

}
class Dog implements Assign52 {

    // Implementing the methods from the interface
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    // Additional method in Dog class
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    public static void main(String[] args) {
        // Creating object of Dog class
        Dog dog = new Dog();

        // Calling methods implemented from interface
        dog.sound();
        dog.eat();

        // Calling Dog class specific method
        dog.sleep();
    }
}