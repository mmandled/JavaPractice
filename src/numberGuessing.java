import java.util.Random;
import java.util.Scanner;

public class numberGuessing {

    public static void main(String[] args) {

        // Number Guessing Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempt = 0;
        int min = 1;
        int max = 100;
        int rand = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);
        do {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
            attempt++;

            if(guess < rand){
                System.out.println("Too Low! Try again");
            }else if(guess > rand){
                System.out.println("Too High! Try again");
            }else{
                System.out.printf("The random number was %d\n", rand);
                System.out.printf("Attempts %d\n", attempt);
            }

        }while(guess != rand);

        System.out.println("YOU HAVE WON");
    }
}