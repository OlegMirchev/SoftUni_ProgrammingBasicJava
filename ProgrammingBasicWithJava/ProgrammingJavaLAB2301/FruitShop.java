package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB2301;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String days = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        boolean isValid = false;

        if (days.equals("Monday") || days.equals("Tuesday") ||
                days.equals("Wednesday") || days.equals("Thursday") || days.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    quantity *= 2.50;
                    break;
                case "apple":
                    quantity *= 1.20;
                    break;
                case "orange":
                    quantity *= 0.85;
                    break;
                case "grapefruit":
                    quantity *= 1.45;
                    break;
                case "kiwi":
                    quantity *= 2.70;
                    break;
                case "pineapple":
                    quantity *= 5.50;
                    break;
                case "grapes":
                    quantity *= 3.85;
                    break;
                default:
                    isValid = true;

            }

        } else if (days.equals("Saturday") || days.equals("Sunday")) {
            switch (fruit) {
                case "banana":
                    quantity *= 2.70;
                    break;
                case "apple":
                    quantity *= 1.25;
                    break;
                case "orange":
                    quantity *= 0.90;
                    break;
                case "grapefruit":
                    quantity *= 1.60;
                    break;
                case "kiwi":
                    quantity *= 3.00;
                    break;
                case "pineapple":
                    quantity *= 5.60;
                    break;
                case "grapes":
                    quantity *= 4.20;
                    break;
                default:
                    isValid = true;

            }
        }else {
            isValid = true;
        }
        if (isValid) {
            System.out.println("error");
        }else {
            System.out.printf("%.2f", quantity);
        }
    }
}
