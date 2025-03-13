package Homework_4.fromLesson.Operators;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        insertedOperators();
    }

    public static void returnMethod(int val){
        if (val == 1){
            System.out.println("You have 1 and it is ok");

        }
    }

    public static void insertedOperators(){
        while(true){

            boolean isActive = false;
            System.out.print("Would you like to play?");
            String answer = null;
            if ((answer = getInput().nextLine()).equalsIgnoreCase("y")){
                isActive = true;

                if (isActive){
                    System.out.println("Your player is active and you can move on now.");
                }
            } else {
                System.out.println("You don't want to play. GOODBYE");
                return;
            }
        }
    }


    public static void getModernSwitch(int dayWeek){
        switch (dayWeek){
            case 1, 2, 3, 4, 5 -> System.out.println("It is from Monday to Friday. It is a working day.");
            case 6, 7 -> System.out.println("It is from Saturday to Sunday. It is a holiday.");
            default -> System.out.println("There is no such day in the week under the number: " + dayWeek);
        }
    }


    public static void getSwitchNoBreak(int dayWeek){

        switch (dayWeek){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is from Monday to Friday. It is a working day.");
                break;
            case 6:
            case 7:
                System.out.println("It is from Saturday to Sunday. It is a holiday.");
                break;
            default:
                System.out.println("There is no such day in the week under the number: " + dayWeek);
                break;
        }
    }

    public static void checkDayWeek(){

        int day;

        do{
            System.out.print("Please, enter day of the week in integer number (1-7): ");
            day = getInput().nextInt();

            advancedSwitch(day);
        } while(day != -1);
    }

    public static void checkAge(){
        System.out.print("Please, tell us your age: ");

        int age;

        while((age = getInput().nextInt()) >= 18){
            System.out.println("You are adult or above: " + age);
            System.out.print("Please, tell us your age: ");
        }
    }

    // Check day behind a number
    public static void advancedSwitch(int dayWeek){
        switch (dayWeek){
            case 1:
                System.out.println("You have entered number " + dayWeek + ". It is MONDAY.");
                break;
            case 2:
                System.out.println("You have entered number " + dayWeek + ". It is TUESDAY.");
                break;
            case 3:
                System.out.println("You have entered number " + dayWeek + ". It is WEDNESDAY.");
                break;
            case 4:
                System.out.println("You have entered number " + dayWeek + ". It is THURSDAY.");
                break;
            case 5:
                System.out.println("You have entered number " + dayWeek + ". It is FRIDAY.");
                break;
            case 6:
                System.out.println("You have entered number " + dayWeek + ". It is SATURDAY.");
                break;
            case 7:
                System.out.println("You have entered number " + dayWeek + ". It is SUNDAY.");
                break;
            default:
                System.out.println("There is no such day in the week under the number: " + dayWeek);
                break;
        }
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }
}