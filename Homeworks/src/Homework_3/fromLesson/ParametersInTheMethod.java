package Homework_3.fromLesson;

public class ParametersInTheMethod {
    public static void main(String[] args) {
        getPersonalData("Evgeny", "Sabuk", 26, "Manual Tester");
        System.out.println("/n");
        calculateSum(45, 109, "Evgeny");
        System.out.println("Once again...");

        double x = 167.5;
        double y = 67.190;
        //calculateSum(x, y);

        String message = "Welcome to a method with parameters. I understand, it is a bit complicated.";
        System.out.println("/n");
        getMsg(message);

    }


    public static void getPersonalData(String name, String surname, int age, String occupation) {
        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your occupation is: " + occupation);
    }


    public static void calculateSum(double x, double y, String namee) {
        double sum = x + y;

        System.out.println("Sum of " + x + " and " + y + " equals to: " + sum + "Name: " + namee);
    }


    public static void getMsg(String msg) {
        System.out.println("Your message is: " + msg);
    }
}
