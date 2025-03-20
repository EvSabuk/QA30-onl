package Homework_6.guessword;

import java.util.Random;
import java.util.Scanner;

public class guessword {
    public static void main(String[] args) {
        getIntroductoryMsg();
        startGame();

    }


    public static void startGame() {


        if (playGame()) {
            getInstructions();
            char[] hiddenWord = getRandomWord(words()).toCharArray();
            int quantitySymbols = hiddenWord.length;


            System.out.println("your hidden word is: ".toUpperCase());
            showWord(hiddenWord);


            System.out.print("Please, enter a LETTER or a WHOLE WORLD to GUESS: ");
            while (true) {


                String input = input().nextLine();

                if (input.isEmpty()) {
                    System.out.println("Please, enter at least 1 symbol.");
                } else if (input.length() == 1) {

                        char[] guessWord = new char[quantitySymbols];
                        char userValue = input.charAt(0);
                        int wrongSymb = 0;
                        int wrongValue =0;
                        {
                            for (int i = 0; i < hiddenWord.length; i++) {
                                if (Character.toLowerCase(hiddenWord[i]) == Character.toLowerCase(userValue)) {
                                    guessWord[i] = userValue;
                                } else {guessWord[i] = '*'; wrongSymb++;}
                            }
                            if (wrongSymb == hiddenWord.length) {
                                System.out.println("The word does not contain this letter.");
                            }
                            for (char el : guessWord) {
                                System.out.print(el + "\t");
                            }

                            while (true) {

                                int count = 0;

                                for (int d = 0; d < hiddenWord.length; d++) {
                                    if (Character.toLowerCase(guessWord[d]) == '*') {
                                        count++;
                                    } else continue;
                                }

                                if (count > 0) {
                                    System.out.print("\nPlese enter one more symbol: ");
                                    String value = input().nextLine();

                                    if (value.isEmpty()) {
                                        System.out.print("Please, enter at least 1 symbol.");
                                        continue;
                                    }

                                    char userValue2 = value.charAt(0);
                                    count = 0;
                                    wrongValue =0;
                                    for (int index = 0; index < hiddenWord.length; index++) {

                                        if (Character.toLowerCase(hiddenWord[index]) ==
                                                Character.toLowerCase(userValue2)) {
                                            guessWord[index] = userValue2;
                                        } else { wrongValue++; continue; }

                                    }
                                    if (wrongValue == hiddenWord.length) {
                                        System.out.println("The word does not contain this letter.");
                                    }
                                } else break;

                                for (char el : guessWord) {
                                    System.out.print(el + "\t");

                                }
                            }
                            System.out.println("\nYOU HAVE GUESSED THE WORD. YOU HAVE WON!");
                            startGame();
                        }

                    System.out.println();
                    return;


                } else if (input.length() > 1) {
                    if (checkWord(input, hiddenWord)) {
                        System.out.println("YOU HAVE GUESSED THE WORD. YOU HAVE WON!");
                        startGame();
                        return;
                    } else {
                        System.out.println("YOU MISSED!");
                        System.out.print("Try One more time: ");
                    }
                }

            }

        } else {
            System.out.println("\nYou said NO. GOODBYEEEEE!".toUpperCase());
            return;
        }
    }

    public static void getIntroductoryMsg() {
        System.out.println("Welcome to Guess Word Game. The PC randomly selects words and hides it.");
        System.out.println("You should guess the word. If you are successful - YOU WIN.");
        System.out.println("****************************************************************************");
    }

    public static boolean playGame() {

        System.out.print("Would you like to play a GAME? (y - YES, the rest NO): ");

        return input().nextLine().equalsIgnoreCase("y");
    }

    public static void getInstructions() {
        System.out.println("The AI have created a set of hidden words. It stored these words in an array.");
        System.out.println("The random number has been generated to randomly select a word from the array.");
        System.out.println("You should guess the word either by a LETTER or a FULL WORD.");
        System.out.println("*****************************************************************************");
    }

    public static String[] words() {
        return new String[]{
                "Apple", "House", "Car", "Stone", "Dragon",
                "Vehicle", "Pineapple", "Watermelon", "Globe", "Tree",
                "Java", "Python", "Banana", "Building", "Butter",
                "Computer", "Notebook", "Bag", "Trousers", "Wardrobe"
        };
    }

    public static String getRandomWord(String[] hiddenWords) {
        // верни мне массив hiddenWords[создай случайное число от 0 до длины массива]
        // если массив длиной в 20 элементов - то случайное число буде от 0 до 20, 0-19
        return hiddenWords[new Random().nextInt(0, hiddenWords.length)];
    }

    public static void showWord(char[] word) {
        for (char letter : word) {
            System.out.print(letter + "\t");
        }
        System.out.println();
    }

    public static boolean checkWord(String input, char[] word) {
        return String.valueOf(word).equalsIgnoreCase(input);
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }
}
