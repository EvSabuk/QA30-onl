package Homework_6.Homework.ATM;

import java.util.Scanner;

public class ATM {
    private final int twentyDollar = 20;
    private final int fiftyDollar = 50;
    private final int hundredDollar = 100;

    private int quantityTwenty;
    private int quantityFifty;
    private int quantityHundred;
    private long totalBalance;

    public ATM() {
        this.quantityTwenty = 0;
        this.quantityFifty = 0;
        this.quantityHundred = 0;
        addCashToATM(quantityTwenty, quantityFifty, quantityHundred);
        System.out.println("Now ATM is empty. Please, enter the number of banknotes of different denominations.");
    }

    public void addCashToATM(int twenty, int fifty, int hundred) {
        this.totalBalance += (twentyDollar * twenty) + (fiftyDollar * fifty) + (hundredDollar * hundred);
    }

    public void getBalance() {
        System.out.println("The remaining balance is: " + totalBalance + "$");
    }

    public void addCashToATM() {
        System.out.print("Enter the quantity of $20 banknotes: ");
        int twenty = input().nextInt();

        System.out.print("Enter the quantity of $50 banknotes: ");
        int fifty = input().nextInt();

        System.out.print("Enter the quantity of $100 banknotes: ");
        int hundred =  input().nextInt();

        this.addCashToATM(twenty, fifty, hundred);
        this.countBanknotes(twenty, fifty, hundred);
    }

    public void countBanknotes(int twenty, int fifty, int hundred) {
        this.quantityTwenty += twenty;
        this.quantityFifty += fifty;
        this.quantityHundred += hundred;

    }

    public void takeOutCash(int cash){
        int twenty =  this.quantityTwenty;
        int fifty =  this.quantityFifty;
        int hundred =  this.quantityHundred;

        int checkHundred = Math.min(cash / 100, hundred);
        cash -= checkHundred * 100;

        int checkFifty = Math.min(cash / 50, fifty);
        cash -= checkFifty * 50;

        int checkTwenty = Math.min(cash / 20, twenty);
        cash -= checkTwenty * 20;

        System.out.println("You receive banknotes 100$ = " + checkHundred +
                ", 50$ = " + checkFifty + ", 20$ = " + checkTwenty);

    }

    public void addCashToAccount() {

        System.out.print("Please insert bills into the bill acceptor. You will need to specify correct quantity and" +
                " denomination in the input field. \nSpecify 0, if these denomination won't be added.\n");
        addCashToATM();
    }

    public boolean getCash(int cash) {
        if (cash > 0) {
            if (this.totalBalance >= cash ) {
                if (cash % 10 ==0) {
                    for (int x = 0; x <= cash / 100; x++) {
                        for (int y = 0; y <= (cash - x * 100) / 50; y++) {
                            int remaining = cash - (x * 100 + y * 50);
                            if (remaining % 20 == 0) {
                                return true;
                            }
                        }
                    } return false;
                } else {
                    System.out.println("ATM has only these types of banknotes: 20$, 50$, 100$. " +
                            "Please try again.");
                    return false;
                }
            } else {
                System.out.println("The ATM can give a maximum amount equal to " + this.totalBalance +
                        "$. Please try again.");

                return false;
            }
        } else {
            System.out.println("Incorrect value. Please try again.");
            return false;
        }

    }

    public void takeOutCash() {
        System.out.print("Enter the amount to be withdrawn: ");
        int cash = input().nextInt();

        if (getCash(cash)) {
            this.totalBalance -= cash;
            takeOutCash(cash);
        } else takeOutCash();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }
}