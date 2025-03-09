package Homework_3.fromLesson;

public class Loops {
    public static void main(String[] args){
        keyWords();
        useDoWhile();
        checkIncrement();
        setDoWhile();
    }

    public static void setDoWhile(){
        int numbers = 1;

           do{
            System.out.println(numbers);
            numbers++;
        } while(numbers <= 10);
    }
    public static void useDoWhile(){
        int age = 12;
        do {age++;
            System.out.println("The is value equal: " + age);

        } while(age < 18);
    }

    public static void checkIncrement(){
        int[] nums = {10, 20, 30, 40};
        int i = 0;

        System.out.println("10?: = " + nums[i++]);
        System.out.println("30?: = " + nums[++i]);
    }


    public static void setWhile(){
        int numbers = 1;

        while(numbers <=10){
            System.out.println(numbers);
            numbers++;
        }
    }

    public static void setFor(){
           for (int number = 1; number <= 10; number++){
            System.out.println(number);
        }

           }

    public static void keyWords(){
        // break - ломает оператор или цикл
        // continue - пропускает повтор код в цикле
        // return - ломает весь метод

        for (int num = 1; num <= 10; num++){
            if (num == 5){
                break;
            }
            System.out.println(num);
        }

        System.out.println("\n\n");

        for (int num = 1; num <= 10; num++){
            if (num == 5){
                continue;
            }
            System.out.println(num);
        }

        System.out.println("\n\n");

        for (int num = 1; num <= 10; num++){
            if (num == 7){
                return;
            }
            System.out.println(num);
        }

        System.out.println("YOU CAN'T ACCESS BECAUSE RETURN KILLED THE METHOD!");
    }
}
