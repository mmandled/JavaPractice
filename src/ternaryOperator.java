public class ternaryOperator {

    public static void main(String[] args) {

        // TERNARY OPERATOR ? = return 1 of 2 values if a condition is true

        // variable = (condition) ? return true : return false;

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
