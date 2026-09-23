import java.util.Random;
import java.util.Scanner;

public class diceProgram {

    public static void main(String[] args) {

        // Dice Roller Program

        // DECLARE VARIABLE
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total;

        // GET # OF DICE FROM THE USER

        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        // CHECK IF # DICE > 0

        if(numOfDice > 0){
            System.out.println("You roll the dice");
        }else{
            System.out.println("# of dice must be greater than 0");
        }

        // ROLL ALL THE DICE

        // GET TOTAL

        // DISPLAY ASCII OF DICE

        scanner.close();
    }
}
