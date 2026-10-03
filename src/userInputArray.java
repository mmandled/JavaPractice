import java.util.Scanner;

public class userInputArray {

    public static void main(String[] args) {

        //Enter user Input to Array

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("Enter # of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        scanner.close();
    }
}
