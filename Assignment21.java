public class Assignment21  {


    static class A {
        A(int marks){
            System.out.println("A constuctor");
        }

        void display(){
            System.out.println("method of A ");
        }
    }

    static class B extends A{
       B(){
    super(22);
           System.out.println("B constuctor");
}
        void display(){
           super.display();
            System.out.println("method of B");
        }
    }


    public static void main(String[] args) {
         B obj = new B();
         obj.display();
    }
}
