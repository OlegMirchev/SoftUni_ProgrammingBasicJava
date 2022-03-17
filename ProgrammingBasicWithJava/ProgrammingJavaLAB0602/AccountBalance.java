package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0602;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String account = scanner.nextLine();
        double sum = 0.0;

        while (!account.equals("NoMoreMoney")) {
            double numb = Double.parseDouble(account);
            if (numb < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += numb;
            System.out.printf("Increase: %.2f%n", numb);
            account = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}
