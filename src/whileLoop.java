import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {

        // While loop = repeat some code forever while some condition remains true

        Scanner scanner = new Scanner(System.in);

//        String name = "";

//        if(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.printf("Hello %s", name);

//        while(name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.printf("Hello %s", name);

        //INFINITE LOOP

//        while(1 == 1){
//
//        }

//        String response = "";
//
//        while(!response.equals("Q")){
//            System.out.println("You are playing a game");
//            System.out.print("Press Q to quit: ");
//            response = scanner.next().toUpperCase();
//        }
//
//        System.out.println("You have quit the game.");

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age cant be negative.");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.printf("You are %d years old", age);

        scanner.close();
    }
}
