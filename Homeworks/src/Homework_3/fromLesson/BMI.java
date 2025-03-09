package Homework_3.fromLesson;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        startBMI();
    }

      public static void startBMI(){
        getInitialMsg();
        getBMIData();
    }

    public static void getInitialMsg() {
        System.out.println("                             INSTRUCTIONS                            ");
        System.out.println("Добро пожаловать в калькулятор по вычислению индекса вашего тела.");
        System.out.println("Этот калькулятор покажет, соответствует ли ваш вес вашему росту\nи нужно ли вам " +
                "задуматься над диетой или же поднабрать вес.\n");

    }

       public static void getBMIData(){
         Scanner input = new Scanner(System.in);

        System.out.print("Пожалуйста, введите свой вес в КГ: ");
        double weight = input.nextDouble();
        System.out.print("Пожалуйста, введите свой рост в СМ: ");
        double height = input.nextDouble();

        calculateBMI(weight, height);
    }


    public static void calculateBMI(double weight, double height){

        height /= 100;
        double indexBMI = weight/(height * height);

        getBMIIndexMsg(indexBMI);
    }


    public static void getBMIIndexMsg(double indexBMI){

        if (indexBMI > 29) {
            System.out.println("У вас избыточный вес. Вам неоходимо похудеть");
        }
        else if (indexBMI <=29 && indexBMI >25) {
            System.out.println("У вас всё отлично. Продолжайте в том же духе!");
        }
        else {
            System.out.println("У вас нехватает веса. Вам необходимо больше кушать");}



    }
}

