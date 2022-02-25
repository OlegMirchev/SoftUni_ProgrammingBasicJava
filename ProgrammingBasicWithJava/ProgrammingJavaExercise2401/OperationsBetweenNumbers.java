package ProgrammingBasic2021.TasksFromExercise.ProgammingJavaJan2021Ex2401;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double result = 0.0;
        String even = "";
        String odd = "";

        switch (symbol) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", n1, symbol, n2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", n1, symbol, n2, result);
                }
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", n1, symbol, n2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", n1, symbol, n2, result);
                }
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", n1, symbol, n2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", n1, symbol, n2, result);
                }
                break;
            case "/":
                result = 1.00 * n1 / n2;
                if (!(n2 == 0)) {
                    System.out.printf("%d %s %d = %.2f", n1, symbol, n2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero", n1);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %s %d = %.0f", n1, symbol, n2, result);
                }
                break;
        }
    }
}



