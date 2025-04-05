package Homework_10.the_third_task;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckText {
    public static void main(String[] args) {
        checkText();
    }


    public static void checkText() {
        System.out.print("Please enter array if words: ");
        String text = input().nextLine();
        String[] myArray = text.split("[^A-Za-z]+");
        String result = "";
        int min =999;

        for (String word : myArray) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : word.toCharArray()) {
                uniqueChars.add(c);
            }

            if (uniqueChars.size() < min) {
                min = uniqueChars.size();
                result = word;
            }
        }

        System.out.println(result);
    }


    public static Scanner input(){
        return new Scanner(System.in);
    }
}
