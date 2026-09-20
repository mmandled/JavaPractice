public class breakContinue {

    public static void main(String[] args) {

        // Break = break out of a loop (STOP)
        // Continue = skip current iteration of a loop (SKIP)

        for(int i = 1; i <= 10; i++){

            if(i == 5){
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
