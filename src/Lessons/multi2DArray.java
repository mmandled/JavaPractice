package Lessons;

public class multi2DArray {

    public static void main(String[] args) {

        // 2D Array = An array where each element is an array
        //              useful for storing a matrix of data

          //1D
//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};

//        String[][] groceries = {{"apple", "orange", "banana"},
//                                {"potato", "onion", "carrot"},
//                                {"chicken", "pork", "beef", "fish"}};
//
//        groceries[0][0] = "mango";
//        groceries[1][0] = "brocolli";
//        groceries[2][1] = "lamb";
//
//        for(int i = 0; i < groceries.length; i++){
//            for(int j = 0; j < groceries[i].length; j++){
//                System.out.print(groceries[i][j] + " ");
//            }
//            System.out.println();
//             }

            char[][] telephone = {{'1', '2', '3'},
                                  {'4', '5', '6'},
                                  {'7', '8', '9'},
                                  {'*', '0', '#'}};

            for(int i = 0; i < telephone. length; i++){
                for(int j = 0; j < telephone[i].length; j++){
                    System.out.print(telephone[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
