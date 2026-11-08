package OOP.toString;

public class Main {

    public static void main(String[] args) {

        //.toString() = Method inherited from the Object class.
        //              used to return a string representation of an object
        //              by default, it returns a hash code as a unique identifier
        //              it can be overridden to provide meaningful details

        Object object = new Object();
        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Black");

        System.out.println(car1);
        System.out.println(car2);
    }
}
