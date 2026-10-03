package exercises;

import java.util.Scanner;

public class slipperySlope {

    public static void main(String[] args) {

        /* SLIPPERY SLOPE
        We have an upcoming Lessons.math competition and one of the questions involve calculating the slope of a line. In order to verify their answers efficiently, we would need you to create a simple program that could solve for the slope. Thanks in advance!
            Formula: m = (y2 - y1) / (x2 - x1)
         */

        Scanner scanner = new Scanner(System.in);

        double y1, y2, x1, x2;

        System.out.print("Enter y2: ");
        y2 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        x2 = scanner.nextDouble();

        System.out.print("Enter x1: ");
        x1 = scanner.nextDouble();

        double result = (y2 - y1) / (x2 - x1);

        System.out.printf("%.2f", result);


        scanner.close();
    }
}
