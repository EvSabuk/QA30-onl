package Homework_8.staff;

public class runPost {
    public static void main(String[] args) {
        Worker workInfo = new Worker();
        Accountant accountantInfo = new Accountant();
        Director directorInfo = new Director();

        workInfo.getInformation();
        accountantInfo.getInformation();
        directorInfo.getInformation();
    }
}
