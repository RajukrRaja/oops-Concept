// 1. cannot create an instance of an abstract class 
// 2. can have abstract/ non - abstract methods
// 3.can have constructors

package OopsConcept.Abstraction;

public class Vechile {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        chicken c1 = new chicken();
        c1.eat();
        c1.walk();

        System.out.println(h1.color);

        Mustang myHorse = new Mustang();

    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");

    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse Constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("Horse walks very fast");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class chicken extends Animal {

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("chicken walk very slow");
    }
}
