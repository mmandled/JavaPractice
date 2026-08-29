import java.util.Scanner;

public class temperatureConverter {

    public static void main(String[] args) {

        // TEMPERATURE CONVERTER

        Scanner scanner = new Scanner(System.in);

        double temp;
        String unit;
        double newTemp;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C / F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("F")) ? (temp * 5 / 9) + 32 : (temp - 32) * 5 / 9 ;

        System.out.printf("%.1f°%s", newTemp, unit);

        scanner.close();
    }
}
