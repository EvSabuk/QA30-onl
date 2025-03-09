package Homework_3.fromLesson;
import java.util.Scanner;

public class operators {
    public static void main(String[] args){
       // getIfOperator();
        setSwitch();
//
    }

    public static void getIfOperator(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter your age: ");
        int age = input.nextInt();
        if (age >= 12) {
            System.out.println("Вы совершеннолетний");
        }

        if (age < 18){
            System.out.println("Дитя");
        }
        nonLogicalIf();
    }

    public static void nonLogicalIf(){
        boolean isMarried = false;
        boolean isEmployed = false;

        if (!isMarried){
            System.out.println("Your are not married.");
        }

        if (isEmployed){
            System.out.println("Your are employed, you have job.");
        }

        if (!isEmployed){
            System.out.println("Your are not employed!");
            setElseIf();
        }
    }

    public static void setElseIf(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter your age: ");
        int age = input.nextInt();


        if (age >= 18 && age < 65) {
            System.out.println("Вы совершеннолетний человек.");
        } else if (age >= 65){
            System.out.println("Вам уже больше или равно 65 - вы официально ПЕНСИОНЕР.");
        } else if (age < 18 && age > 0){
            System.out.println("Господи, да вы совсем ребенок!");
        } else {
            System.out.println("Вы ввели какую-то чушь!");
        }
        setLogicalOr();
    }

    public static void setLogicalOr(){
        boolean isMarried = false;
        boolean isEngaged = true;

        if (isMarried || isEngaged){
            System.out.println("If you are married or engaged you will have this message.");
        }
    }

    public static void setSwitch(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the day: ");
        String day = input.nextLine();

        switch (day){
            // if (day == "Monday")
            case "Monday":
                System.out.println("Today very busy day: " + day);
                break; // keyword который ломает оператор и цикл
            case "Tuesday":
                System.out.println("Today is a hot day : " + day);
                break;
            case "Wednesday":
                System.out.println("Today is your birthday: " + day);
                break;
            case "Thursday":
                System.out.println("Today is a workday: " + day);
                break;
            case "Friday":
                System.out.println("Today is sickday: " + day);
                break;
            case "Saturday":
                System.out.println("Today is hockey match: " + day);
                break;
            case "Sunday":
                System.out.println("Today is sunny day: " + day);
                break;
            default:
                System.out.println("There is no such day in a week.");
        }
    }
}