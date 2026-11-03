package OOP.superr;

public class Main {
    public static void main(String[] args) {

        //super = Refers to the parent class (subclass <- superclass)
        //        Used in constructors and method overriding
        //        Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Jerry");
        Student student = new Student("Harry", "Potter", 3.25);
        Employee employee = new Employee("John", "Smith", 500000);

        employee.showSalary();

        student.showGPA();
        student.showName();
    }
}
