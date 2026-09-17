import java.util.Scanner;

public class logicalOperators {

    public static void main(String args[]) {

        // Logical Operators
        // && = And Operator
        // || = Or Operator
        // ! = Not Operator

//        double temp = -10;
//        boolean isSunny = true;
//
//        if(temp <= 30 && temp >=0 && isSunny) {
//            System.out.println("The Weather is good.");
//            System.out.println("It is Sunny outside");
//        } else if(temp <= 30 && temp >=0 && !isSunny){
//            System.out.println("The Weather is CLOUDY.");
//        } else if(temp > 30 || temp < 0){
//            System.out.println("The Weather is bad");
//        }

        Scanner scanner = new Scanner(System.in);

        // username must be 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces and underscores");
        }else {
            System.out.printf("Welcome %s", username);
        }

        scanner.close();
    }

}
