public class printF {

    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flag][width][.precision][specific-character]

        //[specific-character]/Format Specifier

        // String = %s;
        // char = %c;
        // int = %d;
        // double = %f;
        // boolean = %b;

        //String name = "Bro";
        //char firstLetter = 'B';
        //int age = 30;
        //double height = 60.5;
        //boolean isEmployed = true;

        //System.out.printf("Hello %s\n", name);
        //System.out.printf("Your name starts a letter %c\n", firstLetter);
        //System.out.printf("Your age is %d\n", age);
        //System.out.printf("Your height is %f\n", height);
        //System.out.printf("You are currently %b\n", isEmployed);

        //System.out.printf("\n%s is %d years old\n", name, age);

        // [.precision] = limit the amount of decimals

        //double price1 = 9.99;
        //double price2 = 100.15;
        //double price3 = -54.01;

        //System.out.printf("%.1f\n", price1);
        //System.out.printf("%.2f\n", price2);
        //System.out.printf("%.3f\n", price3);

        // [flag]

        // + = output a plus
        // , = comma grouping separator for any thousands place
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        //double price1 = 90.99;
        //double price2 = 100000.15;
        //double price3 = -54.01;

        //System.out.printf("%+.1f\n", price1);
        //System.out.printf("%,.2f\n", price2);
        //System.out.printf("%(.3f\n", price3);

        // space

        //System.out.printf("\n% .1f\n", price1);
        //System.out.printf("% .2f\n", price2);
        //System.out.printf("% .3f\n", price3);

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // 0
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        // number
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        //negative number
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
