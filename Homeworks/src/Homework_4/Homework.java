package Homework_4;
import java.util.Scanner;
import java.util.*;

public class Homework {
    public static void main(String[] args) {
       // checkValueInArray();
      //  removeValueFromArray();
      //  getMaxMinAvgValues();
       // compareTwoArrays();
      //  getArrayWithEven();
      //  changeOddIndexToZero();
       // getSortedArray();
        getBubbleSort();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }


    public static void checkValueInArray() {
        int[] array = new int[] {25, 47, 34, 18, 96, 33, 28, 55, 87, 13, 17, 24};

        System.out.print("Please enter your value:  ");
        int userValue = input().nextInt();

        int arrayValue = -1;
        for (int i = 0; i < array.length; i++) {
            if (userValue == array[i]) {
                arrayValue = userValue;
                break;
            }

            }
        if (arrayValue != -1) {
            System.out.println("Value " + arrayValue + " in the array.");
        } else {
            System.out.println("Value " + userValue + " not in the array.");
        }
        }

    public static void removeValueFromArray() {

        int[] array = new int[] {25, 47, 34, 18, 96, 33, 28, 55, 87, 13, 17, 24};
        int[] arrayWithoutValue = new int[array.length];
        System.out.print("Please enter the value, which will be removed from array: ");
        int userValue = input().nextInt();

        for(int i = 0; i < array.length; i++){
            if(array[i] != userValue){
                arrayWithoutValue[i] = array[i];
            } else continue;

        }
        for (int el : arrayWithoutValue) {
            System.out.print(el + "\t");
        }
    }

    public static void getMaxMinAvgValues() {
        System.out.print("Enter array length: ");
        int[] array = new int[input().nextInt()];


        for(int index = 0; index <array.length; index++) {
            System.out.print("Please enter " + (index +1) + " integer values for array: ");
            array[index] = input().nextInt();
        }
        System.out.println("Your array filled by next values: ");
        for (int el : array) {
            System.out.print( el + "\t");
        }

        int min = array[0];
        int max = array[0];
        int avg = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            avg += array[i];
        }
        System.out.println("\nMin value equal: " + min);
        System.out.println("Max value equal: " + max);
        System.out.println("Average value equal: " + (avg/array.length));
    }

    public static void compareTwoArrays() {
        int[] theFirstArray = new int[5];
        int[] theSecondArray = new int[5];

        for (int i = 0; i < theFirstArray.length; i++) {
            theFirstArray[i] = (int) (Math.random() * 1000);
        }

        System.out.println("The first array was created and filled with next values: ");
        for (int el : theFirstArray) {
            System.out.print( el + "\t");
        }

        for (int i = 0; i < theSecondArray.length; i++) {
            theSecondArray[i] = (int) (Math.random() * 1000);
        }
        System.out.println("\nThe second array was created and filled with next values: ");
        for (int el : theSecondArray) {
            System.out.print( el + "\t");
        }

        int avgForFirstArray = theFirstArray[0];
        int avgForSecondArray = theSecondArray[0];

        for (int i = 1; i < theFirstArray.length; i++) {
            avgForFirstArray += theFirstArray[i];
        }

        for (int i = 1; i < theSecondArray.length; i++) {
            avgForSecondArray += theSecondArray[i];
        }

        if (avgForFirstArray > avgForSecondArray) {
        System.out.println("\nThe average value " + (avgForFirstArray/theSecondArray.length) + " of the first array " +
         "is greater than the average value " + (avgForSecondArray/theSecondArray.length)+ " of the second array.");
        } else if (avgForFirstArray <  avgForSecondArray) {
        System.out.println("\nThe average value " + (avgForFirstArray/theSecondArray.length) + " of the first array " +
        "is smaller than the average value " + (avgForSecondArray/theSecondArray.length) + " of the second array.");
        } else
        System.out.println("\nThe average value " + (avgForFirstArray/theSecondArray.length) + " of the first array " +
        "is equal the average value " + (avgForSecondArray/theSecondArray.length)+ " of the second array.");
        }

    public static void getArrayWithEven() {
        while(true){
            boolean isActive = false;
            System.out.print("Enter length for array (5-10 length): ");
            int answer = input().nextInt();
            if (answer < 5 || answer >=10){
                isActive = true;

                if (isActive){
                    System.out.println("Value is invalid. Please enter length for array (5-10 length):");
                }
            } else {
                int[] arrayFull = new int[answer];

                for (int i = 0; i < arrayFull.length; i++) {
                    arrayFull[i] = (int) (Math.random() * 1000);
                }
                System.out.println("The array was created and filled with next values: ");
                for (int el : arrayFull) {
                    System.out.print( el + "\t");
                }

                int[] arrayEven = new int[arrayFull.length];
                for(int i =0; i < arrayEven.length; i++) {
                    if (arrayFull[i] % 2 == 0) {
                        arrayEven[i] = arrayFull[i];
                    } else continue;
                }

                System.out.println("\nNew array was created with only even values: ");
                for (int el : arrayEven) {
                    System.out.print( el + "\t");
                }
                return;

            }

        }


        }

    public static void changeOddIndexToZero() {
        System.out.print("Enter length for array: ");
        int answer = input().nextInt();

        int[] arrayFull = new int[answer];

        for (int i = 0; i < arrayFull.length; i++) {
            arrayFull[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Created random array: ");
        for (int el : arrayFull) {
            System.out.print(el + "\t");
        }

        int[] arrayOdd = new int[arrayFull.length];
        for (int i = 0; i < arrayOdd.length; i++) {
            if (i % 2 == 0) {
                arrayOdd[i] = arrayFull[i];
            } else continue;
        }
        System.out.println("\nAll odd indexes changed to 0 in array: ");
        for (int el : arrayOdd) {
            System.out.print(el + "\t");
        }
    }

    public static void getSortedArray() {
        System.out.print("Enter array length: ");
        String[] array = new String[input().nextInt()];


        for (int index = 0; index < array.length; index++) {
            System.out.print("Please enter " + (index + 1) + " user name for array: ");
            array[index] = input().nextLine();
        }
        System.out.println("Your array filled by next values: ");
        for (String el : array) {
            System.out.print(el + "\t");
        }

        System.out.println("\nYour sorted array: ");
        Arrays.sort(array);
        for (String el : array) {
            System.out.print(el + "\t");
        }
    }

    public static void getBubbleSort() {
        System.out.print("Enter array length: ");
        String[] array = new String[input().nextInt()];


        for (int index = 0; index < array.length; index++) {
            System.out.print("Please enter " + (index + 1) + " user name for array: ");
            array[index] = input().nextLine();
        }
        System.out.println("Your array filled by next values: ");
        for (String el : array) {
            System.out.print(el + "\t");
        }

        System.out.println("\nYour sorted array: ");

        for (int i = 0; i < array.length - 1; i++) {
            for (int a = 0; a < array.length - 1 - i; a++) {
                if (array[a].compareTo(array[a + 1]) > 0) {
                    String temp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                }
            }
        }

        for (String el : array) {
            System.out.print(el + "\t");
        }
    }

}
