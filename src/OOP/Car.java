package OOP;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("Starting Car");
    }
    void stop(){
        isRunning = false;
        System.out.println("Stopping Car");
    }

    void drive(){
        System.out.printf("Driving Car %s\n", model);
    }

    void brake(){
        System.out.printf("Braking Car %s\n", model);
    }
}
