package OOP.abstraction;

public abstract class Shape {

    abstract double area(); //ABSTRACT METHODS

    void display(){//THIS IS A CONCRETE METHOD
        System.out.println("This is a shape");
    }
}
