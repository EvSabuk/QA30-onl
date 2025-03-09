package Homework_3.Homework;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // get Time of the year using switch:
        // getTimeOfYearSwitch();

        // get Time of the year using if-else-if:
        // getTimeOfYearIfElse();

        // value odd or even?
        //  getEvenOdd();

        //  get outside temperature
        //  getOutsideTemperature();

        //  get rainbow colors
        //  getRainbowColors();

        // odd values from 1 to 99
        // getOdd();

        // from 5 to 1
        // getLower();

        // summ all numbers till specified one
        // getSumOfNumbers();

       // getMultipleValue();

      //  getTopTen();

      //  getSquares();

      //  getFibonachi();

        //  GetDepositValue();
        //getMultiplicationTable();


    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void getTimeOfYearSwitch() {
        System.out.print("Please enter number of month: ");
        int monthNum = input().nextInt();

        switch (monthNum) {
            case 1, 2, 12:
                System.out.println("It's a winter month!");
                break;
            case 3, 4, 5:
                System.out.println("It's a spring month!");
                break;
            case 6, 7, 8:
                System.out.println("It's a summer month!");
                break;
            case 9, 10, 11:
                System.out.println("It's a autumn month!");
                break;
            default:
                System.out.println("There is invalid value. Please enter value between 1 and 12");
        }
    }

    public static void getTimeOfYearIfElse() {
        System.out.print("Please enter number of month: ");
        int monthNum = input().nextInt();

        if ((monthNum >= 1 && monthNum < 3) || monthNum == 12) {
            System.out.println("It's a winter month!");
        } else if (monthNum >= 3 && monthNum < 6) {
            System.out.println("It's a spring month!");
        } else if (monthNum >= 6 && monthNum < 9) {
            System.out.println("It's a summer month!");
        } else if (monthNum >= 9 && monthNum < 12) {
            System.out.println("It's a autumn month!");
        } else {
            System.out.println("There is invalid value. Please enter value between 1 and 12");
        }


    }

    public static void getEvenOdd() {
        System.out.print("Please enter number: ");
        int number = input().nextInt();

        if ((number % 2) > 0) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }

    public static void getOutsideTemperature() {
        System.out.print("Please enter outside temperature: ");
        double temp = input().nextDouble();

        if (temp > -5) {
            System.out.println("The weather is warm");
        } else if (temp <= -5 && temp > -20) {
            System.out.println("The weather is normal");
        } else {
            System.out.println("The weather is cold");
        }
    }

    public static void getRainbowColors() {
        System.out.print("Please enter number of color in the rainbow: ");
        int numColor = input().nextInt();

        switch (numColor) {
            case 1:
                System.out.println("It's a red color!");
                break;
            case 2:
                System.out.println("It's a orange color!");
                break;
            case 3:
                System.out.println("It's a yellow color!");
                break;
            case 4:
                System.out.println("It's a green color!");
                break;
            case 5:
                System.out.println("It's a blue color!");
                break;
            case 6:
                System.out.println("It's a indigo  color!");
                break;
            case 7:
                System.out.println("It's a violet color!");
                break;
            default:
                System.out.println("There is no such color.");
        }
    }

    public static void getOdd() {
        for (int number = 1; number <= 99; number++) {
            if ((number % 2) == 0) {
                continue;
            }
            System.out.println(number);
        }

    }

    public static void getLower() {
        for (int number = 5; number > 0; number--) {
            System.out.println(number);
        }
    }

    public static void getSumOfNumbers() {
        System.out.print("Please enter number: ");
        int number = input().nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            }
            System.out.println("Sum of numbers till " + number + " is equal to: " + sum);
        }

    public static void getMultipleValue() {
        int number = 7;

        while(number < 99){
            System.out.println(number);
            number += 7;
        }

    }

    public static void getTopTen() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(num);
            num -= 5;
        }

    }

    public static void getSquares() {
        for (int i = 10; i <= 20; i++) {
           int  Square = i * i;
            System.out.println(Square);
        }

    }
    public static void getFibonachi() {
        int previous = 0;
        int now = 1;

        for (int i = 1; i <= 11; i++) {
            System.out.println(previous);
            int next = previous + now;
            previous = now;
            now = next;
        }

    }

    public static void GetDepositValue() {
        System.out.print("Please enter your deposit: ");
        float deposit = input().nextFloat();

        System.out.print("Please enter quantity of months: ");
        int months = input().nextInt();

        for (int i = 1; i <= months; i++) {
            deposit += deposit * 0.07f;


        }
        System.out.println("Amount of deposit will be " + deposit + " after " + months + " months.");
    }
    public static void  getMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(" " + (i*a) + " ");
            }
            System.out.println();
        }
    }
}


