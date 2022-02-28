package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB3001;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLily = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        double money = 0.0;
        double toys = 0.0;
        double brother = 0.0;

        for (int i = 1; i <= ageLily; i++) {
            if (i % 2 == 0) {
                money += 10;
                sum += money;
                brother++;
            }else {
                toys++;
            }
        }
        double left = sum + (toys * priceToy) - brother;
        if (left >= priceWashMachine) {
            double leftMoneyWashMachine = left - priceWashMachine;
            System.out.printf("Yes! %.2f", leftMoneyWashMachine);
        }else {
            double needed = priceWashMachine - left;
            System.out.printf("No! %.2f", needed);
        }
    }
}
