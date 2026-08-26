import java.util.Scanner;

public class compoundInterestCalculator {

    public static void main(String[] args){

        // Compound Interest Calculator

        // FORMULA = a = P(1 + i(r/n)^nt

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int n;
        int t;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compound per year: ");
        n = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        t = scanner.nextInt();

        double a =  principal * Math.pow(1 + rate / n, n * t);

        System.out.printf("\nThe amount after %d is: $%.2f\n", n, a);

        scanner.close();

    }
}
