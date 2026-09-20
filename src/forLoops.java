import java.util.Scanner;

public class forLoops {

    public static void main(String[] args) throws InterruptedException {

        // for loops == execute some code a CERTAIN  amount of times
        // for(initialization; condition; iterate)

//        for(int i = 0; i < 10; i++){
//            System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);

//        int num;
//
//        System.out.print("Enter how many times you want to loop: ");
//        num = scanner.nextInt();
//
//        for(int i = 1; i <= num; i++){
//            System.out.println(i);
//        }



        int start = 0;

        System.out.print("How many seconds to countdown from? ");
        start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!!!!!");

        scanner.close();
    }
}
