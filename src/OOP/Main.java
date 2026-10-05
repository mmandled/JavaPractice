package OOP;

import org.w3c.dom.ls.LSOutput;


public class Main {

    public static void main(String[] args) {

        //Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);

//        System.out.println(car.isRunning);
//        car.start();
//        System.out.println(car.isRunning);
//        car.stop();
//        System.out.println(car.isRunning);

//        car.drive();
//        car.brake();

    }
}
