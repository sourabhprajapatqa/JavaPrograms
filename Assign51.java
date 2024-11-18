public interface Assign51 {
    void sum();
    void subtract();
}

abstract class Aa implements Assign51 {
    abstract void multiply();

    abstract void divide();

    void complete1() {
        System.out.println("Compelte method 1");
    }

    void complete2() {
        System.out.println("Compelte method 2");
    }
}

    class Bb extends Aa{
        @Override
        public void sum() {
            System.out.println("sum");
        }

        @Override
        public void subtract() {
            System.out.println("subtract");
        }

        @Override
        void multiply() {
            System.out.println("multiply");
        }

        @Override
        void divide() {
            System.out.println("divide");
        }

        void method() {
            System.out.println("class BB method");
        }

        public static void main(String[] args) {
          Bb b = new Bb();
            b.divide();
            b.complete1();
            b.multiply();
            b.sum();
            b.complete2();
            b.subtract();
            b.method();
//________________________________________________________________________________________________//
            Aa a = new Bb();
            a.complete1();
            a.complete2();
            a.subtract();
            a.sum();
            a.multiply();
            a.divide();



        }
    }


