package package2;

public class Assign66 {
    class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        // Create an instance of Assign66 to access the inner classes
        Assign66 obj = new Assign66();

        // Upcasting: Dog object is referred to by Animal reference
        Animal myAnimal = obj.new Dog();

        // Calling the method using the reference of superclass
        myAnimal.sound();
    }
}
