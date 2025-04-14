package Homework_11.From_class;


import java.util.Arrays;
import java.util.Scanner;

public class newWay {
    public static void main(String[] args) {
        getStringForCalculation();

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

        String value = row;


        while (value.contains("/") || value.contains("*") || value.contains("+") || value.contains("-")) {
            String[] splitExpression = value.split("[+/\\-*]");
            String[] operators = value.split("\\d+(\\.\\d+)?");
            String[] operatorsSkip = Arrays.copyOfRange(operators, 1, operators.length);
            if (value.contains("/") || value.contains("*")) {
                if (!value.contains("*") || value.indexOf("/") < value.indexOf("*") && value.contains("/")) {
                    int IndexOperator = indexOf(operatorsSkip, "/");

                    double valueL = Double.parseDouble(splitExpression[IndexOperator]);
                    double valueR = Double.parseDouble(splitExpression[IndexOperator + 1]);

                    double valueTotal = valueL / valueR;
                    String forReplace = (splitExpression[IndexOperator] + "/" + (splitExpression[IndexOperator + 1]));

                    value = value.replace(String.valueOf(forReplace), String.valueOf(valueTotal));

                }  else if (!value.contains("/") || value.indexOf("/") > value.indexOf("*")) {
                    int IndexOperator = indexOf(operatorsSkip, "*");

                    double valueL = Double.parseDouble(splitExpression[IndexOperator]);
                    double valueR = Double.parseDouble(splitExpression[IndexOperator + 1]);

                    double valueTotal = valueL * valueR;
                    String forReplace = (splitExpression[IndexOperator] + "*" + (splitExpression[IndexOperator + 1]));

                    value = value.replace(forReplace, String.valueOf(valueTotal));

                }

            }else if (value.contains("+") || value.contains("-")) {
                if (!value.contains("-") || value.indexOf("+") < value.indexOf("-") && value.contains("+")) {
                    int IndexOperator = indexOf(operatorsSkip, "+");

                    double valueL = Double.parseDouble(splitExpression[IndexOperator]);
                    double valueR = Double.parseDouble(splitExpression[IndexOperator + 1]);

                    double valueTotal = valueL + valueR;
                    String forReplace = (splitExpression[IndexOperator] + "+" + (splitExpression[IndexOperator + 1]));

                    value = value.replace(forReplace, String.valueOf(valueTotal));
                    System.out.println(value);
                }  else if (!value.contains("+") || value.indexOf("+") > value.indexOf("*")) {
                    int IndexOperator = indexOf(operatorsSkip, "-");

                    double valueL = Double.parseDouble(splitExpression[IndexOperator]);
                    double valueR = Double.parseDouble(splitExpression[IndexOperator + 1]);

                    double valueTotal = valueL - valueR;
                    String forReplace = (splitExpression[IndexOperator] + "-" + (splitExpression[IndexOperator + 1]));

                    value = value.replace(forReplace, String.valueOf(valueTotal));
                    System.out.println(value);
                }

            }
        }
            return Double.parseDouble(value);
        }



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
