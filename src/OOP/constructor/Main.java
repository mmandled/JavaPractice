package OOP.constructor;

public class Main {

    public static void main(String[] args) {

        //constructor = A special method to initialize objects
        //              You can pass arguments to a constructor
        //              and set up initial values


        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Sheena", 20, 3.1);
        Student student3 = new Student("Jack", 40, 3.3);

        System.out.printf("%s, %d, %.1f\n", student1.name, student1.age, student1.gpa);
        System.out.printf("%s, %d, %.1f\n", student2.name, student2.age, student2.gpa);
        System.out.printf("%s, %d, %.1f\n", student3.name, student3.age, student3.gpa);

        student1.study();
    }
}
