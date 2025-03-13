package Homework_4.fromLesson.Arrays;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        getRandomMassive();
    }

    public static void changeArraySize() {
        int[] numbers = new int[]{1, -1, 0, 19, 20};

        // Расширяем оригинальный массивы на десять элементов
        int[] extendedNumbers = new int[numbers.length + 10];

        // Копирование элементов оригинального массива в новый
        for (int index = 0; index < numbers.length; index++) {
            extendedNumbers[index] = numbers[index];
        }

        System.out.println("Your old array is: ");
        for (int el : numbers) {
            System.out.print(el + "\t");
        }

        System.out.println("\nYour new array is: ");

        for (int el : extendedNumbers) {
            System.out.print(el + "\t");
        }

        System.out.println();
    }

    public static void fillArrayWithRandomNumbers() {
        Random randomValues = new Random();

        System.out.print("Please, enter array size: ");
        int length = input().nextInt();

        int[] randomNumbers = new int[length];

        for (int index = 0; index < randomNumbers.length; index++) {
            // Random (от, до) - 0, 11 от 0 до 11 (максимальное значение, 10)
            randomNumbers[index] = randomValues.nextInt(1, 11);
        }

        for (int el : randomNumbers) {
            System.out.println("Value: " + el);
        }
    }

    public static void getArrayAdvancedLoop() {
        String[] week = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        for (String day : week) {
            System.out.println(day);
        }

        System.out.println("Lets change values: ");
        for (String day : week) {
            day = "WELCOME";
            System.out.println(day);
        }

        System.out.println("*******************************");
        for (String day : week) {
            System.out.println(day);
        }
    }

    public static void setArrayLoop() {
        char[] englishAlphabet = new char[26];

        for (int index = 0, letter = 65; index < englishAlphabet.length; index++, letter++) {
            englishAlphabet[index] = (char) letter;
        }

        System.out.println("You array englishAlphabet contains:");

        for (int index = 0; index < englishAlphabet.length; index++) {
            System.out.print(englishAlphabet[index] + "\t");
        }
        System.out.println("\n*******************************************");

        // Advanced for loop ONLY FOR READING
        // TO PROTECT ORIGINAL ARRAY
        for (char letter : englishAlphabet) {
            System.out.print(letter + "\t");
        }
        System.out.println();
    }

    public static void getBasicArray() {

        String[] names;

        names = new String[5];

        System.out.println(names);


        names[0] = "Archil";
        names[1] = "Vladimir";
        names[2] = "Katya";
        names[3] = "Yulia";
        names[4] = "Irina";


        System.out.println(names[0]);


        System.out.println("****************************");

        char[] letters = new char[10];
        letters[0] = 'c';
        letters[5] = 'R';

        System.out.println(letters[0]);


        System.out.println("*********************************");

        int[] numbers = new int[]{-1, 9, 100, 5, 9};


        System.out.println(numbers[numbers.length - 1]); // 5 -1 = 4
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void getMaxMin() {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};

        int min = mas[0];
        int max = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
            if (mas[i] > max) {
                max = mas[i];
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    public static void getArray() {
        System.out.print("Введите размер массива: ");
        int size = input().nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = input().nextInt();
        }

        System.out.println("\nВы ввели массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }


    }
    public static void getMaxMinAvgValues() {
        System.out.print("Enter array length: ");
        int[] array = new int[input().nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Your array filled by random values: ");
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
    public static void getRandomMassive() {
        System.out.print("Ввведите желаемый размер массива: ");
        double[] array = new double[input().nextInt()];


        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();

        }
        System.out.println("Your array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\n");

        }
    }
}
