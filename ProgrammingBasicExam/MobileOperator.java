package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contract = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String mobileNet = scanner.nextLine();
        int numbMonthPay = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (contract.equals("one")) {
            switch (typeContract) {
                case "Small":
                    price = 9.98;
                    break;
                case "Middle":
                    price = 18.99;
                    break;
                case "Large":
                    price = 25.98;
                    break;
                case "ExtraLarge":
                    price = 35.99;
                    break;
            }
        }else if (contract.equals("two")) {
            switch (typeContract) {
                case "Small":
                    price = 8.58;
                    break;
                case "Middle":
                    price = 17.09;
                    break;
                case "Large":
                    price = 23.59;
                    break;
                case "ExtraLarge":
                    price = 31.79;
                    break;
            }
        }
        if (mobileNet.equals("yes")) {
            if (price <= 10) {
                price += 5.50;
            }else if (price <= 30) {
                price += 4.35;
            }else {
                price += 3.85;
            }
        }
        if (contract.equals("two")) {
            price *= 0.9625;
        }
        double totalSum = price * numbMonthPay;
        System.out.printf("%.2f lv.", totalSum);
    }
}
