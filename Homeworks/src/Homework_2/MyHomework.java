package Homework_2;

public class MyHomework {
    public static void main(String[] args) {

        getArithmeticOperations();
        getBasicVariables();
    }

    public static void getBasicVariables(){
        getMyPrivateData();
        System.out.println("Welcome to Java");

        byte myByte = 111;
        short myShort = 22222;
        int myInteger = 1_333_333_000;
        long myLong = -4_444_444_444_915L;

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInteger);
        System.out.println("long: " + myLong);

        char letter = 'H';
        System.out.println("Character: " + letter + ". int: " + (int) letter);
        letter = 'h';
        System.out.println("Character: " + letter + ". int: " + (int) letter);
        letter = (char) (letter + 10);
        System.out.println("Character: " + letter + ". int: " + (int) letter);


        float myFloat = 33.1234F;
        double myDouble = 33.12345678;

        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);

        boolean turnOn = true;
        boolean turnOff = false;

        System.out.println("Is my TV turned on? " + turnOn);
        System.out.println("Is my TV turned off? " + turnOff);

        turnOn = false;
        turnOff = true;

        // Reference types - ссылочные типы
        String string = "My first name is Evgeny and my last name is Sabuk" + ". And my age is 26.";

        String myAge = 26 + " is my age";
        System.out.println("This is a String variable: " + string);
    }

    public static void getMyPrivateData(){
        String name = "Evgeny";
        String surname = "Sabuk";
        int age = 26;
        float height = 183.2F;

        String myOccupation = "Manual Tester";
    }

    public static void getArithmeticOperations(){
        casting();
        int myHeight = 183;
        int yourHeight =95;
        int difference = myHeight - yourHeight;

        System.out.println("The difference is: " + difference);
        System.out.println("The difference directly: " + (myHeight - yourHeight));

        double myAge = 26;
        double yourAge = 44.4;
        System.out.println("Multiply: " + (myAge * yourAge));

        int days = 365;
        int months = 12;
        double weeks = (double) days / months;
        System.out.println("Weeks in the year: " + weeks);

        System.out.println("How many times we can store 5 in 20: " + (20%5));

        int var = 100;
        int pixels = 105;
        var = var + pixels;
        var -= pixels;
        System.out.println("Var: " + var);
    }

    public static void casting(){

        short value = 22_222;
        int intValue = value;
        long myLong = intValue;
        double myDouble = intValue;

        double doubleBigValue = 34_568;
        int storeDouble = (int) doubleBigValue;


        boolean isAlive = true;

        int age = 36;
        String stringAge = String.valueOf(age);
        int stringAgeConverted = Integer.parseInt(stringAge);
    }
}