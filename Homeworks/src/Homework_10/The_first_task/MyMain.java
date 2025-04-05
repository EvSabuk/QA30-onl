package Homework_10.The_first_task;


public class MyMain {
    public static void main(String[] args) {
        getInformation();
    }

    public static void getInformation() {
    StaticMethods.getTwoMainBlocks(document());
    StaticMethods.replaceLetters(document());
    StaticMethods.getOnlyLetters(document());
    StaticMethods.getLettersWithDescription(document());
    StaticMethods.checkABC(document());
    StaticMethods.startWith(document());
    StaticMethods.endWith(document());


    }

    public static String document() {
        return ("5552-ABC-6537-DHS-1A2B");
    }
}
