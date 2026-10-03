package Lessons;

import java.util.Arrays;

public class arrays {

    public static void main(String[] args){

        // Arrays = a collection of values of the same data type
        //            * think of it as a variable that can store more the 1 value *

        String[] fruits = {"Banana", "Orange", "Apple", "Coconut"};

//        fruits[1] = "pineapple";
//        int numOffFruits = fruits.length;

//        for(int i = 0; i < fruits.length; i++){
//            System.out.println(fruits[i]);
//        }

        //ENCHANCE FOR LOOP
        //Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){ //for every fruit in my array fruits please do this
            System.out.println(fruit);
        }


    }
}
