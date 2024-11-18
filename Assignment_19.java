public class Assignment_19 {
//WAP on parameterized and non-parameterized this calling statement in java

    static class Car{

        String brand;
        String model;

        Car(){
        System.out.println("Non paramterized constructor called");
        }

        Car(String brand, String model){
            System.out.println("paramterized constructor called");
            this.brand = brand;
            this.model = model;
        }
        void display(){
            System.out.println("brand " + brand + " Model " +model );
        }


public static void main(String[] args){
            Car car1 = new Car();
            car1.display();
    Car car2 = new Car("Toyota", "Corolla");
    car2.display();
}


    }

}
