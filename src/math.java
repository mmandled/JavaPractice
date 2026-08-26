import java.util.Scanner;

public class math {

    public static void main(String[] args) {

        // Math

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        //double result;

        //result = Math.pow(2, 3);      Power of exponent
        //result = Math.abs(-5);        any negative value convert to positive
        //result = Math.sqrt(9);        Square root
        //result = Math.round(2.9);     Round to the nearest whole number
        //result = Math.ceil(3.14);     Round up
        //result = Math.floor(3.99);    Round down
        //result = Math.max(10, 20);    Find the large value
        //result = Math.min(10, 20);    Find the small value

        //System.out.println("\n" + result);

        //      HYPOTENUSE c = Math.sqrt(a² + b²);

        //Scanner scanner = new Scanner(System.in);

        //double a;
        //double b;
        //double c;

        //System.out.print("Enter the length of side a: ");
        //a = scanner.nextDouble();

        //System.out.print("Enter the length of side b: ");
        //b = scanner.nextDouble();


        //c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        //System.out.println("\nThe side c is: " + c + "cm");

        //scanner.close();

            // circumference = 2 * Math.Pi * radius;
            // area = Math.PI * Math.pow(radius, 2);
            // volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

            Scanner scanner = new Scanner(System.in);

            double radius;
            double circumference;
            double area;
            double volume;

            System.out.print("Enter the radius: ");
            radius = scanner.nextDouble();

            circumference = 2 * Math.PI * radius;
            area = Math.PI * Math.pow(radius, 2);
            volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

            System.out.printf("\nCircumference: %.1fcm\n", circumference);
            System.out.printf("Area: %.1fcm²\n", area);
            System.out.printf("Volume: %.1fcm³\n", volume);


            scanner.close();
    }
}


