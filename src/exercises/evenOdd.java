package exercises;

import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        scanner.close();
    }
}
