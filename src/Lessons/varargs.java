package Lessons;

public class varargs {

    public static void main(String[] args) {

        //varargs = allow a method to accept a varying # of arguments
        //           makes method more flexible, no need for overload methods
        //          java will pack the arguments into an array
        //          ... (ellipsis)



        //System.out.println(add(1, 2, 3, 4, 10));

        System.out.println(average(1.4, 1.5, 1.3, 1.2, 1.6));
    }

    static int add(int... numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0) return 0;

        for(int i = 0; i < numbers.length; i++){
            sum+=numbers[i];
        }

        return sum / numbers.length;
    }
}
