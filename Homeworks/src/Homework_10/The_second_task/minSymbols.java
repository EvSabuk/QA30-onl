package Homework_10.The_second_task;

import java.util.Scanner;

public class minSymbols {
    public static void main(String[] args) {
        checkText();
    }

    public static void checkText() {
        System.out.print("Please enter array if words: ");
        String text = input().nextLine();
        String[] myArray = text.split("[^A-Za-z]+");
        int wordLength = 0;
        String word = "";
        for (String s : myArray) {
            if(wordLength <s.length()){
                wordLength = s.length();
                word = s;
            } else continue;
        }
        System.out.println("The longest word is: "+ word);

        for (String s : myArray) {
            if(wordLength >= s.length()){
                wordLength = s.length();
                word = s;
            } else continue;
        }
        System.out.println("The shortest word is: "+ word);

    }


    public static Scanner input(){
        return new Scanner(System.in);
    }
}
