import java.util.Scanner;

public class bankingProgram {

    public static void main(String[] args) {

        // Banking Program

        Scanner scanner = new Scanner(System.in);

        // DECLARE VARIABLES
        double balance = 0;
        int choice;

        do{
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.println("***************");
            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 ->{
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    balance = deposit(balance, amount);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    balance = withdraw(balance, amount);
                }
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        }while(choice != 4);

        // DISPLAY MENU
        // GET AND PROCESS USERS CHOICE
        // showBalance()
        // deposit()
        // withdraw()
        // EXIT MESSAGE

        scanner.close();

    }
    static void showBalance(double balance){
        System.out.printf("Your Balance is $%.2f\n", balance);
    }

    static double deposit(double balance,  double amount){
        if(amount < 0){
            System.out.println("Balance can't be negative");
            return 0;
        }else{
            balance += amount;
            System.out.printf("Your new balance is $%.2f\n", balance);
            return balance;
        }
    }

    static double withdraw(double balance, double amount){

        if(amount < 0){
            System.out.println("Balance can't be negative");
        }if(amount > balance){
            System.out.println("You don't have enough money to withdraw");
            return balance;
        }else{
            balance -= amount;
            System.out.printf("You withdraw $%.2f\n", amount);
            System.out.printf("Your new balance is $%.2f\n", balance);
            return balance;
        }

    }
}
