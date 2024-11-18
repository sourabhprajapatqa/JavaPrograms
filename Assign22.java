public class Assign22 {
    //WAP in which abstract class is present along with concrete class
    static abstract class A{

        abstract void display();

         void login(){
            System.out.println("login method");
        }

    }

    static class B extends A{


         @Override
         void display() {
             System.out.println("hided method display");
         }
     }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();

    }
}
