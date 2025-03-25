package Homework_6.Homework.Computer;


public class MyMain {
    public static void main(String[] args) {
        getComputerInfo();
        getComputerInfoDefault();

    }

    public static void getComputerInfo() {

        RAM ram = new RAM("Kingston", 32);
        HDD hdd =  new HDD("Kingston", 250, "Internal");
        Computer computer = new Computer(123, "asus", hdd, ram);


        System.out.println(computer);
    }

    public static void getComputerInfoDefault() {
        Computer computer = new Computer(123, "asus");
        System.out.println(computer);
    }


    }

