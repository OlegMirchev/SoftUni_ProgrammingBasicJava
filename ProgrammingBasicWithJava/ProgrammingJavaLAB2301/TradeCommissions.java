package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB2301;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        boolean isValid = false;

        if (sells >= 0 && sells <= 500) {
            switch (city) {
                case "Sofia":
                    sells *= 0.05;
                    break;
                case "Varna":
                    sells *= 0.045;
                    break;
                case "Plovdiv":
                    sells *= 0.055;
                    break;
                default:
                    isValid = true;
            }
        } else if (sells > 500 && sells <= 1000) {
            switch (city) {
                case "Sofia":
                    sells *= 0.07;
                    break;
                case "Varna":
                    sells *= 0.075;
                    break;
                case "Plovdiv":
                    sells *= 0.08;
                    break;
                default:
                    isValid = true;
            }
        } else if (sells > 1000 && sells <= 10000) {
            switch (city) {
                case "Sofia":
                    sells *= 0.08;
                    break;
                case "Varna":
                    sells *= 0.10;
                    break;
                case "Plovdiv":
                    sells *= 0.12;
                    break;
                default:
                    isValid = true;
            }
        } else if (sells > 10000) {
            switch (city) {
                case "Sofia":
                    sells *= 0.12;
                    break;
                case "Varna":
                    sells *= 0.13;
                    break;
                case "Plovdiv":
                    sells *= 0.145;
                    break;
                default:
                    isValid = true;
            }
        } else {
            isValid = true;
        }
        if (isValid) {
            System.out.println("error");
        }else {
            System.out.printf("%.2f", sells);
        }
    }
}
