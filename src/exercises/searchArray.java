package exercises;

import java.util.Scanner;

public class searchArray {

    public static void main(String[] args) {

        // SEARCH AN ARRAY
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 7, 5, 2, 3, 9, 4};
        String[] fruits = {"apple", "orange", "pineapple", "banana"};
        String target;
        boolean isFound = false;


        //Search a number
//        System.out.print("Enter the number to be searched: ");
//        target = scanner.nextInt();
//
//        for(int i = 0; i < numbers.length; i++){
//            if(numbers[i] == target){
//                System.out.printf("Element found at index %d", i);
//                isFound = true;
//                break;
//            }
//        }

        //Search a String
        System.out.print("Enter the fruit you want to search: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(target.equals(fruits[i])){
                System.out.printf("Element found at index %d", i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found");
        }

        scanner.close();
    }
}
