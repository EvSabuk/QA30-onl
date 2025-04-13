package Homework_11.From_class;


import java.util.Arrays;
import java.util.Scanner;

public class newWay {
    public static void main(String[] args) {
        getCalculation("22/2/4");

    }

    public static void getStringForCalculation() {
        System.out.print("Please, entry the row for calculation: ");
        String input = input().nextLine();
        input = input.replace("×", "*").replace("÷", "/");
        input = input.replaceAll("\\s+", "");
        System.out.println(input);
        IdentifyBrackets(input);
    }

    public static double IdentifyBrackets(String input) {
        while (input.contains("(")) {
            int finish = input.indexOf(")");
            int start = input.lastIndexOf("(", finish);

            String union = input.substring(start + 1, finish);  //(35/2*4+4/2)
            double calculation = getCalculation(union);

            input = input.substring(0, start) + calculation + input.substring(finish + 1);
        }
        return getCalculation(input);
    }

    public static double getCalculation(String row) {
        String[] splitExpression = row.split("[+/\\-*]");
        String[] operators = row.split("\\d+");
        String[] operatorsSkip = Arrays.copyOfRange(operators, 1, operators.length);

        if (row.contains("/") || row.contains("*")) {
            if (row.indexOf("/") > row.indexOf("*") ) {
                int IndexOperator =  indexOf(operatorsSkip, "/");

                double valueL = Double.parseDouble(splitExpression[IndexOperator]);
                double valueR = Double.parseDouble(splitExpression[IndexOperator+1]);

                System.out.println(valueL/valueR);
            }

        }
        return 0;
    }

 /*
        while (row.contains("/")) {
            int finish = row.indexOf(")");
            int start = row.lastIndexOf("(", finish);

            String union = row.substring(start + 1, finish);
            double calculation = getCalculation(union);

            row = row.substring(0, start) + calculation + row.substring(finish + 1);
        }
        return getCalculation(row);
    }
*/


    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static int indexOf(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
