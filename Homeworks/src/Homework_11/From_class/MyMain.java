package Homework_11.From_class;
import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        String expression = "78+((36×8)÷2)+12*2";
        expression = expression.replace("×", "*").replace("÷", "/");

        double result = evaluate(expression);
        System.out.println("Result: " + result);
    }

    public static double evaluate(String expr) {
        // Удаляем пробелы
        expr = expr.replaceAll("\\s+", "");

        // Обрабатываем скобки рекурсивно
        while (expr.contains("(")) {
            int close = expr.indexOf(")");
            int open = expr.lastIndexOf("(", close);

            String inner = expr.substring(open + 1, close);
            double value = evaluateSimple(inner);

            expr = expr.substring(0, open) + value + expr.substring(close + 1);
        }

        // Считаем оставшееся выражение без скобок
        return evaluateSimple(expr);
    }

    // Метод, который считает выражение без скобок
    public static double evaluateSimple(String expr) {
        // Сначала умножение и деление
        expr = computeOperators(expr, "[*/]");
        // Потом сложение и вычитание
        expr = computeOperators(expr, "[+-]");
        return Double.parseDouble(expr);
    }

    // Метод для вычисления операций
    public static String computeOperators(String expr, String ops) {
        String regex = "(-?\\d+(\\.\\d+)?)([" + ops + "])(-?\\d+(\\.\\d+)?)";

        while (expr.matches(".*" + regex + ".*")) {
            java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(expr);
            if (m.find()) {
                double left = Double.parseDouble(m.group(1));
                String op = m.group(3);
                double right = Double.parseDouble(m.group(4));
                double result = 0;

                switch (op) {
                    case "*": result = left * right; break;
                    case "/": result = left / right; break;
                    case "+": result = left + right; break;
                    case "-": result = left - right; break;
                }

                // Заменяем подвыражение на результат
                expr = expr.substring(0, m.start()) + result + expr.substring(m.end());
            }
        }

        return expr;
    }
}