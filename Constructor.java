package OopsConcept;

public class Constructor {
    public static void main(String[] args) {
        student s1 = new student("Raju");
        s1.name = "Raju";
        s1.roll = 456;
        s1.Password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        student s2 = new student(s1);
        s2.Password = "xyz";
        s1.marks[2]=100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class student {
    String name;
    int roll;
    String Password;
    int[] marks; // Declare marks as an int array

    // 1. Non - parameterized
    student() {
        marks = new int[3];
        System.out.println("Hello, I am Constructor");
    }

    // 2. parameterized
    student(String name) {
        marks = new int[3];
        this.name = name;
    }

    // parameterized
    student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    // shallow copy constructor
    // student(student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep copy constructor
    student(student s1) {
    marks = new int[3]; // Copy the length of the marks array
    this.name = s1.name;
    this.roll = s1.roll;
    for (int i = 0; i < marks.length; i++) {
    this.marks[i] = s1.marks[i];
    }
    }
}
