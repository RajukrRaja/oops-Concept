


// ---------------compile Time Polymorphim------------------------





public class MethodOverloading {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        System.out.println(c1.sum(5, 5));
        System.out.println(c1.sum((float) 5.5, (float) 6.5));
        System.out.println(c1.sum(80, 10, 10));

    }

}

class Calculator {
    int sum(int a, int b) {
        return a + b;

    }

    float sum(float a, float b) {
        return a + b;

    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}