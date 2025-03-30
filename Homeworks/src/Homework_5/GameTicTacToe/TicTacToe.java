package Homework_5.GameTicTacToe;
import java.util.Random;
import java.util.Scanner;


public class TicTacToe {
    static char empty = '*';

   public TicTacToe(){
       startGame();
   }

    public void startGame(){
        getInitialMSG();

        while(true){
            if ((input().nextLine()).equalsIgnoreCase("y")){

                System.out.println("********************************************");
                getRules();
                System.out.println("********************************************");
                System.out.println("Let's decide who makes the first move.");

                int randomNumber = random().nextInt(0, 101);
                char[][] table = initializeTable();
                if (randomNumber <= 50){
                    System.out.println("Random decided that you go first.");
                      while (true) {
                        readTable(table);
                        makeUserMove(table, 'X');
                        if (checkWin(table, 'X')) {
                            readTable(table);
                            System.out.println("You win. Congratulations!");
                            break;
                        }
                        if (isTableFull(table)) {
                            readTable(table);
                            System.out.println("No one won :c");
                            break;
                        }

                        makeAIMove(table, 'O');
                        if (checkWin(table, 'O')) {
                            readTable(table);
                            System.out.println("Computer win. Good luck next time!");
                            break;
                        }
                        if (isTableFull(table)) {
                            readTable(table);
                            System.out.println("No one won :c");
                            break;
                        }
                    }
                } else {
                    System.out.println("Random decided that AI go first.");
                    while (true) {

                        makeAIMove(table, 'X');
                        if (checkWin(table, 'X')) {
                            readTable(table);
                            System.out.println("Computer win. Good luck next time!");
                            break;
                        }
                        if (isTableFull(table)) {
                            readTable(table);
                            System.out.println("No one won :c");
                            break;
                        }
                        readTable(table);
                        makeUserMove(table, 'O');
                        if (checkWin(table, 'O')) {
                            readTable(table);
                            System.out.println("You win. Congratulations!");
                            break;
                        }
                        if (isTableFull(table)) {
                            readTable(table);
                            System.out.println("No one won :c");
                            break;
                        }
                    }
                }
            } else {
                System.out.println("You choose not to move on with the game. GOODBYE!");
            }
            return;
        }
    }


    public static boolean checkWin(char[][] table, char parameter) {
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == parameter && table[i][1] == parameter && table[i][2] == parameter) ||
                    (table[0][i] == parameter && table[1][i] == parameter && table[2][i] == parameter)) {
                return true;
            }
        }
        if ((table[0][0] == parameter && table[1][1] == parameter && table[2][2] == parameter) ||
                (table[0][2] == parameter && table[1][1] == parameter && table[2][0] == parameter)) {
            return true;
        }
        return false;
    }

    public void makeAIMove(char[][] table, char parameter){
        int x, y;
        do {
            x = random().nextInt(0, 3);
            y = random().nextInt(0, 3);
        } while (table[x][y] != empty);
        table[x][y] = parameter;
        System.out.println("AI made a step: " + (x + 1) + " " + (y + 1));
    }

    public void makeUserMove(char[][] table, char parameter){
        int x, y;
        while (true) {
            System.out.print("Your turn. \nSpecify x (row number): ");
            x = input().nextInt() - 1;
            System.out.print("Specify y (column number): ");
            y = input().nextInt() - 1;
            if (x >= 0 && x < 3 && y >= 0 && y < 3 && table[x][y] == empty) {
                table[x][y] = parameter;
                break;
            }
            System.out.println("Wrong values. Try again.");
        }
    }

    public void getRules() {
        System.out.println("You decided to play the game.");
        System.out.println("Here are the rules. You have a table 3x3.");
        System.out.println("You will play with the AI.");
        System.out.println("To make a move you must enter coordinates x & y.");
        System.out.println("X - rows, y - columns. The first column in the first row equals 1, 1.");
    }

    public void getInitialMSG(){
        System.out.println("********************************************");
        System.out.println("Welcome to Tic-Tac-Toe game.");
        System.out.println("You need to play against AI.");
        System.out.print("Would you like to play a GAME?: (y - YES, the rest NO): ");
    }

    public char[][] initializeTable(){
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'},
        };
    }

    public void readTable(char[][] table){
        for(char[] outer : table){
            for (char inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }

    private static boolean isTableFull(char[][] table) {
        for (char[] row : table) {
            for (char cell : row) {
                if (cell == empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public Scanner input(){
        return new Scanner(System.in);
    }

    public Random random(){
        return new Random();
    }
}