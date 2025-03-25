package Homework_6.Homework.CreditCard;

public class CreditCard {
    private long creditCardNumber;
    private long creditCardMoney;

    public CreditCard(long creditCardNumber, long creditCardMoney){
        this.creditCardNumber = creditCardNumber;
        this.creditCardMoney = creditCardMoney;

    }

    public void withdrawMoneyFromAccount(long value){
        if (value > creditCardMoney){
            System.out.println("User doesn't have enough money on the account. Balance is: " + creditCardMoney);
        } else {
            creditCardMoney -= value;
            System.out.println("User withdrawn this amount of money: " + value +
                    ". Balance is: " + creditCardMoney);
        }
    }

    public void depositMoneyToAccount(long value){

        creditCardMoney += value;
        System.out.println("Cash deposit via Payment Machine. Income amount: " + value);
        System.out.println("Balance is: " + creditCardMoney);

    }
    public String getCreditCardInfo(){
        return "Account card number is: " + creditCardNumber + ".\n" +
                "Account has the following amount of money: " + creditCardMoney;
    }

}
