public class Assignment_20{


//WAP on Method Overriding
    static class A{

     void display()
    {
        System.out.println("Class A defination");
    }

    }


    static class B extends  A
    {
        @Override
     void display()
    {
        System.out.println("Class B override defination");
    }

    public static void main(String []  args)
    {

        B ref = new B();
        ref.display();
    }

}
}



