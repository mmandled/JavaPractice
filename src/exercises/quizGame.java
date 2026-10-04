package exercises;

import java.util.Scanner;

public class quizGame {

    public static void main(String[] args) {

        //QUIZ GAME

        //QUESTION array[]
        String[] questions = {"What is the main function of a router?",
                              "Which part of a computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};

        //OPTIONS array[][]
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2001", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};
        //DECLARE

        Scanner scanner = new Scanner(System.in);

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        //WELCOME
        System.out.println("******************************");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME!");
        System.out.println("******************************");
        System.out.println();


        //QUESTION loop
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            //  OPTION
            for(int j = 0; j < options[i].length; j++){
                System.out.println(options[i][j]);
            }
            System.out.println();
            //  GET GUESS FROM USER
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //  CHECK OUR GUESS
            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }else{
                System.out.println("********");
                System.out.println("WRONG!");
                System.out.println("********");
            }
        }

        //DISPLAY FINAL SCORE
        System.out.printf("Your final score is %d out of %d", score, questions.length);

        scanner.close();
    }
}
