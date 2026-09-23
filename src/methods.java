import java.util.Scanner;

public class methods {

    public static void main(String[] args){

        // method = a block of reusable code that is executed when called ()


        Scanner scanner = new Scanner(System.in);


//        String name = "dave";
//        String lname = "Cab";
        int age;
//        happyBirthday(name, age);

//        System.out.println(square(3));
//        System.out.println(cube(3));
//        System.out.println(getFullName(name, lname));

        System.out.print("Enter you age: ");

        age = scanner.nextInt();

        if(ageCheck(age)){
            System.out.println("You are eligible to sign");
        }else{
            System.out.println("You are not eligible to sign");
        }

        scanner.close();
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else {
            return false;
        }
    }

    static String getFullName(String fname, String lname){
        return fname+" "+ lname;
    }
    static double square(double x){
        return x*x;
    }
    static double cube(double y){
        return y*y*y;
    }
    static void happyBirthday(String n, int a){
        System.out.println("Happy Birthday");
        System.out.printf("Happy Birthday dear %s\n", n);
        System.out.printf("Yeyy %d", a);
    }
}
