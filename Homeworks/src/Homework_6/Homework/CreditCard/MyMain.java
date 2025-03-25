package Homework_6.Homework.CreditCard;

import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        withdrawMoneyFromMyBankAccount();
        //withdrawMoneyFromMyBankAccount
    }

    public static void withdrawMoneyFromMyBankAccount(){
        CreditCard directorCard = new CreditCard(5647_8904_3456_7801L,134_141_678L );
        CreditCard buyerCard = new CreditCard(5793_6577_3126_4516L,43_624L );
        CreditCard staffCard = new CreditCard(8634_4367_3676_0987L,43_345_542L );

        System.out.println("Director has next card and cash amount: ");
        System.out.println(directorCard.getCreditCardInfo() + ".\n");
        System.out.println("Buyer has next card and cash amount: ");
        System.out.println(buyerCard.getCreditCardInfo()+ ".\n");
        System.out.println("Staff has next card and cash amount: ");
        System.out.println(staffCard.getCreditCardInfo()+ ".\n");

        System.out.print("Deposit money to director account: ");
        long directorInput = input().nextLong();


        System.out.print("Deposit money to user account: ");
        long userInput = input().nextLong();

        System.out.print("Withdraw money from staff account: ");
        long staffInput = input().nextLong();

        directorCard.depositMoneyToAccount(directorInput);
        buyerCard.depositMoneyToAccount(userInput);
        staffCard.withdrawMoneyFromAccount(staffInput);

    }


    public static Scanner input() {
        return new Scanner(System.in);
    }
}
