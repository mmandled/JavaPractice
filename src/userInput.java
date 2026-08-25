import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Enter your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a Student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("Your are " + age + " years old ");
//        System.out.println("Your gpa is " + gpa);
//
//        if(isStudent){
//            System.out.println("You are a Student");
//        }else{
//            System.out.println("You are not a Student");
//        }

        //if you input int, double then String, after you scan int
        //type scanner.nextLine(); for the Java to read the Strings


            // Calculate area of a rectangle

        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm²");

        scanner.close();
    }
}
