public interface Assign24_AB
{
//WAP on multiple level inheritance using Interface
void eat();
    void sleep();


}

interface A extends  Assign24_AB{
void methodA();
}

class B implements  A {
   public void methodB(){
System.out.println("1");
    }
    @Override
    public void methodA() {
        System.out.println("2");
    }

    @Override
    public void eat() {
        System.out.println("3");
    }

    @Override
    public void sleep() {
        System.out.println("4");
    }

}
class C {
    public static void main(String[] args) {
        B obj = new B();
        obj.eat();
        obj.methodA();
        obj.methodB();
        //  obj.sleep1();
        obj.sleep();

    }

}