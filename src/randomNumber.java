import java.util.Random;

public class randomNumber {

    public static void main(String[] args) {

        // Random Number

        Random random = new Random();

        int num1;
        int num2;
        int num3;

        double num4;

        boolean isheads;

        num1 = random.nextInt(1, 101);
        num2 = random.nextInt(1, 101);
        num3 = random.nextInt(1, 101);

        num4 = random.nextDouble(0, 10.0);

        isheads = random.nextBoolean();

        if(isheads){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        System.out.println(num4);
    }
}
