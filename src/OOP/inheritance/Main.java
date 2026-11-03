package OOP.inheritance;

public class Main {
    public static void main(String[] args) {

        //inheritance = One class inherits the attributes and methods
        //              from another class.
        //              Child <- Parent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        dog.eat();
        cat.eat();

        dog.speak();
        cat.speak();

        System.out.println(dog.isAlive);
        System.out.println(plant.isAlive);

        plant.photosynthesize();

    }
}
