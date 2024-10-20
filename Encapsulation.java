package OopsConcept;

 class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 25);

        // Access and modify the internal state using getters and setters
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());

        person.setName("Bob");
        person.setAge(-30); // This will print a message but won't change the age

        System.out.println("Updated Person Name: " + person.getName());
        System.out.println("Updated Person Age: " + person.getAge());
    }
}
