package Homework_5;
import java.util.Scanner;


public class homework {
    public static void main(String[] args) {
       //  increaseValuesInArray();
       // paintTheChessboard();
       // multiplyTwoDimensional();
        //sumArrayElements();
      //  sumArrayElementsByDiagonal();
       // getSortedArray();


    }
    public static void increaseValuesInArray() {
        int[][][] array = fillthreeDimensionalByRandom();
        System.out.print("Enter the value, which will be added to array: ");
        int userValue = input().nextInt();

        System.out.println("\nYour new array: ");
        for (int c = 0; c < array.length; c++) {
            for (int r = 0; r < array[c].length; r++) {
                for (int d = 0; d < array[c].length; d++) {
                    array[c][r][d] += userValue;
                    System.out.print(array[c][r][d] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }


    }

    public static void paintTheChessboard() {
        char[][] chessBoard = createTwoDimensionalFromKeyboardChar(8);

        for (int outer = 0; outer < chessBoard.length; outer++){
            for (int inner = 0; inner < chessBoard[outer].length; inner++){
                if((outer + inner) % 2 == 0){
                    chessBoard[outer][inner] = 'W';
                } else  chessBoard[outer][inner] = 'B';
                System.out.print(chessBoard[outer][inner] + "\t");
            }
            System.out.println();
        }
    }

    public static void multiplyTwoDimensional() {
        int[][] theFirstArray = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] theSecondArray = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] arrayResult = new int[theFirstArray.length][theSecondArray[0].length];

        for (int c = 0; c < theFirstArray.length; c++) {
            for (int r = 0; r < theSecondArray[0].length; r++) {
                for (int d = 0; d < theFirstArray[0].length; d++) {
                    arrayResult[c][r] += theFirstArray[c][d] * theSecondArray[d][r];
               }
            }
        }

        System.out.println("The result:");
        for (int c = 0; c < arrayResult.length; c++) {
            for (int r = 0; r < arrayResult[0].length; r++) {
                System.out.print(arrayResult[c][r] + " ");
            }
            System.out.println();
        }
    }

    public static void sumArrayElements() {
        int[][] array = fillTwoDimensionalByRandom();
        int sum = 0;

        System.out.println("\n The sum of array elements:  ");
        for (int outer = 0; outer < array.length; outer++){
            for (int inner = 0; inner < array[outer].length; inner++){
                sum += array[outer][inner];
            }

        }
        System.out.println(sum);

        }

    public static void sumArrayElementsByDiagonal() {
        int[][] array = fillTwoDimensionalByRandom();
        int sum = 0;

        System.out.println("\n The sum of array elements:  ");
        for (int outer = 0; outer < array.length; outer++){
            for (int inner = 0; inner < array[outer].length; inner++){
                if(outer == inner) {
                    sum += array[outer][inner];
                   }else continue;
            }
        }
        System.out.println(sum);
    }

    public static void getSortedArray() {
        int[][] array = fillTwoDimensionalByRandom();



        for (int outer = 0; outer < array.length; outer++) {
            for (int inner = 0; inner < array[outer].length - 1; inner++) {
                for (int sort = 0; sort < array[outer].length - 1 - inner; sort++) {
                    if (array[outer][sort] > array[outer][sort + 1]) {
                        int temp = array[outer][sort];
                        array[outer][sort] = array[outer][sort + 1];
                        array[outer][sort + 1] = temp;

                    }

                  }

            }
        }
        System.out.println("\nSorted Array:");
        for (int outer = 0; outer < array.length; outer++) {
            for (int inner = 0; inner < array[outer].length; inner++) {
                System.out.print(array[outer][inner] + " ");
            }
            System.out.println();
        }
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static int[][] createTwoDimensionalFromKeyboardInt() {
        System.out.print("Please enter quantity columns in array: ");
        int columns = input().nextInt();
        System.out.print("Please enter quantity rows in array: ");
        int rows = input().nextInt();

        int[][] array = new int[columns][rows];
        return array;
    }

    public static char[][] createTwoDimensionalFromKeyboardChar(int valueForChessboard) {
        int columns = valueForChessboard;
        int rows = valueForChessboard;

        char[][] array = new char[columns][rows];
        return array;
    }

    public static int[][] fillTwoDimensionalByRandom() {
        int[][] array = createTwoDimensionalFromKeyboardInt();
        System.out.println("\nYour array has next view: ");
        for (int outer = 0; outer < array.length; outer++){
            for (int inner = 0; inner < array[outer].length; inner++){
                array[outer][inner] = (int) (Math.random() * 1000);
                System.out.print(array[outer][inner] + "\t");
            }
            System.out.println();
        }

        return array;
    }

    public static int[][][] createthreeDimensionalFromKeyboard() {
        System.out.print("Please enter width columns in array: ");
        int columns = input().nextInt();
        System.out.print("Please enter height rows in array: ");
        int rows = input().nextInt();
        System.out.print("Please enter depth rows in array: ");
        int depth = input().nextInt();

        int[][][] array = new int[columns][rows][depth];
        return array;
    }

    public static int[][][] fillthreeDimensionalByRandom() {
        int[][][] array = createthreeDimensionalFromKeyboard();
         System.out.println("\nYour array has next view: ");
        for (int c = 0; c < array.length; c++) {
            for (int r = 0; r < array[c].length; r++) {
                for (int d = 0; d < array[c].length; d++) {
                    array[c][r][d] = (int) (Math.random() * 1000);
                    System.out.print(array[c][r][d] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        return array;
    }

}
