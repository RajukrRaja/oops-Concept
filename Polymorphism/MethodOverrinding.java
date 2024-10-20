package OopsConcept.Polymorphism;

public class MethodOverrinding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eats();

        Animal a1 = new Animal();
        a1.eats();
    }

}

class Animal {
    void eats() {
        System.out.println("eats everythig ");
    }
}

class Deer extends Animal {
    void eats() {
        System.out.println("eats grass");
    }
}