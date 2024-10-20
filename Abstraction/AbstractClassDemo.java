public abstract class Vechile {
    abstract void start();
}

class Car extends Vechile {
    void start() {
        System.out.println("Start with key");
    }
}

public class VechileMain {
    public static void main(String[] args) {
        Vechile c = new Car(); // Corrected class name to match abstract class
        c.start();
    }
}
