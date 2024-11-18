import java.awt.*;

public class Assign23  {

    //WAP in which super most class having 2CM, abstract class having 2AM&2CM, subclass having 2CM

    static class A {
        void display(){
            System.out.println("CM1");
        }
        void login(){
            System.out.println("CM2");
        }

    }
    static abstract class B extends A {
        void display(){
            System.out.println("CM1.1");
        }
        void login(){
            System.out.println("CM2.1");
        }
        abstract void logout();
        abstract void show();

    }
    static class C extends B{

        @Override
        void logout() {
            System.out.println("Now i am complete");
        }

        @Override
        void show() {
            System.out.println("Now i am complete");
        }

        public static void main(String[] args) {
            C obj = new C();
            obj.display();
            obj.login();
            obj.logout();
            obj.show();

        }
    }
}
