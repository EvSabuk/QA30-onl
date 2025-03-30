package Homework_7;

public class Phone {
    private final String number;
    private final String model;
    private final double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public void sendMessage(String... numbers){
        System.out.println("Message was sent to the numbers: ");

        for (String el : numbers) {
            System.out.println(el);
        }
    }

    public Phone() {
        this.number = "+33-423-423-54";
        this.model = "Xiaomi 12 Pro";
        this.weight = 12.5;
    }

    public void receiveCall(String userName) {
        System.out.println(userName + " is calling.");
    }

    public void receiveCall(String userName, String userNumber) {
        System.out.println(userName + " is calling with number " + userNumber);
    }



    public String getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return "Phone" +
                "\nPhone number = " + number  +
                ",\nModel = " + model +
                ",\nWeight = " + weight;
    }
}
