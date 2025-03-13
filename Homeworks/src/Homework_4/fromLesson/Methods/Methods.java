package Homework_4.fromLesson.Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        int getMyAge = getMyAge();
        String myFullName = getMyFullName();

        System.out.println(getMyAge());
        System.out.println(getMyFullName());

       System.out.println("What is the day? " + getQuantityDays(12) );
    }

    public static char getSexTernary(char symbol){
        return (symbol == 'f') ? 'f' : (symbol == 'm') ? 'm' : 'u';
    }


    public static char getSex(char symbol){
        if (symbol == 'f') return 'f';
        else if (symbol == 'm') return 'm';

        return 'u';
    }

    public static String getQuantityDays(int value) {
        return (value == 1) ? "monday" : (value == 2) ? "Friday" : "Any" ;
    }

    public static boolean checkStatus(boolean won){
        if (won)
            return true;
        return false;
    }

    public static String getFullDetails(String name, String surname, int age, String occupation){
        return "Your personal data is:\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Age: " + age + "\n" +
                "Occupation:" + occupation + ".\n";
    }

    public static String getFullName(String name, String surname){
        return name + " " + surname;
    }

    // Signature
    public static void getMyName(String name, int age){

    }
    public static String getMyFullName(){
            return "Evgeny";
    }

    public static Scanner getInput(){
      return new Scanner(System.in);
    }

    public static int getMyAge(){
        return 18;
    }
}
