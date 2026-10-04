package exercises;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args) {

        //ROCK PAPER SCISSORS

        //DECLARE
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        //GET CHOICE FROM THE USER
        do{
        System.out.print("Enter your move (rock/paper/scissors): ");
        playerChoice = scanner.next().toLowerCase();

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper")  && !playerChoice.equals("scissors")){
            System.out.println("Invalid choice.");
            continue;
        }

        //GET RANDOM CHOICE FROM THE COMPUTER
        computerChoice = choices[random.nextInt(choices.length)];
            System.out.printf("Computer choose: %s\n", computerChoice);

        //CHECK WIN CONDITIONS
            if (playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }else if(playerChoice.equals("rock") && computerChoice.equals("scissors") ||  playerChoice.equals("paper") && computerChoice.equals("rock") || playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You win!");
            }else{
                System.out.println("You lost!");
            }

        //ASK TO PLAY AGAIN
            System.out.print("Want to play again? (yes/no): ");
            playAgain = scanner.next().toLowerCase();
        }while(playAgain.equals("yes"));

        //GOODBYE MESSAGE
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
