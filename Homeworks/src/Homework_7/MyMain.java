package Homework_7;

public class MyMain {
    public static void main(String[] args) {
        Phone IPhone = new Phone("+375-33-244-24-12", "14 Pro Max", 12.2);
        Phone Samsung = new Phone("+995-551-00-44-12", "S22 Ultra", 15.2);
        Phone Pixel = new Phone("+48-214-22-12-33", "7 Pro", 13.5);
        Phone Xiaomi = new Phone();

        System.out.println(IPhone);
        System.out.println(Samsung);
        System.out.println(Pixel);
        System.out.println(Xiaomi);

        IPhone.receiveCall("Gena");
        IPhone.receiveCall("Elena", "+375-33-44-112-34");

        IPhone.sendMessage("+48-214-22-12-33","+47-214-22-12-33","+46-214-22-12-33","+45-214-22-12-33");

    }


}
