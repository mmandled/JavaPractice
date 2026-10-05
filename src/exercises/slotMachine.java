package exercises;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class slotMachine {

    public static void main(String[] args) {

        // SLOT MACHINE

        //DECLARE

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //DISPLAY WELCOME MESSAGE
        System.out.println("*************************");
        System.out.println("  Welcome to Java Slots  ");
        System.out.println("Symbols: 🍒 🍉 🍊 🍎 🍓 ");
        System.out.println("*************************");


        //PLAY IF BALANCE > 0

        while(balance > 0){
            //ENTER BET AMOUNT
            System.out.printf("Current Balance: $%d\n", balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            //  VERIFY IF BET > BALANCE
            if(bet > balance){
                System.out.println("INSUFFICIENT BALANCE");
                continue;
            }

            //  VERIFY IF BET > 0
            else if(bet <= 0){
                System.out.println("BET MUST BE GREATER THAN 0");
                continue;
            }

            else {
                balance -= bet;
            }

            //  SUBTRACT BET FROM BALANCE
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.printf("You win $%d\n", payout);
                balance += payout;
            }else{
                System.out.println("You lost!");
            }

            //ASK TO PLAY AGAIN
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.next().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }

        //EXIT MESSAGE
        System.out.printf("GAME OVER! Your final balance is $%d\n",  balance);

        scanner.close();
    }
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍊", "🍎", "🍓"};
        String[] row = new String[3];
        Random random = new Random();

        //SPIN ROW
        for(int i = 0; i < 3; i++){
            row[i] =  symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        //DISPLAY ROW
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static int getPayout(String[] row, int bet){
        //GET PAYOUT

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍊" -> bet * 5;
                case "🍎" -> bet * 10;
                case "🍓" -> bet * 20;
                default -> 0;
            };
        }else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🍎" -> bet * 5;
                case "🍓" -> bet * 10;
                default -> 0;
            };
        }else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🍎" -> bet * 5;
                case "🍓" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }
}
