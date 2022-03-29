package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex0702;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyHoliday = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spendDays = 0;
        boolean isValid = false;

        while (moneyHoliday > availableMoney) {
            days++;
            String spendSave = scanner.nextLine();
            double sumSpendSave = Double.parseDouble(scanner.nextLine());
            if (spendSave.equals("spend")) {
                spendDays++;
                availableMoney -= sumSpendSave;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            } else if (spendSave.equals("save")) {
                spendDays = 0;
                availableMoney += sumSpendSave;
            }
            if (spendDays == 5) {
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            System.out.printf("You saved the money for %d days.", days);
        } else {
            System.out.printf("You can't save the money.%n" +
                    "%d", days);
        }
    }
}
