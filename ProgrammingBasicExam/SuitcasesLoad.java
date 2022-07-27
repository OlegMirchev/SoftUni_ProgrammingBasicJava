package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacityTrunk = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int counterSuit = 0;
        boolean isValid = false;

        while (!command.equals("End")) {
            double volSuitcase = Double.parseDouble(command);

            counterSuit++;
            if (counterSuit % 3 == 0) {
                volSuitcase *= 1.10;
            }
            if (volSuitcase > capacityTrunk) {
                counterSuit--;
                isValid = true;
                break;
            }
            capacityTrunk -= volSuitcase;
            command = scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("No more space!%n" +
                    "Statistic: %d suitcases loaded.", counterSuit);
        }else {
            System.out.printf("Congratulations! All suitcases are loaded!%n" +
                    "Statistic: %d suitcases loaded.", counterSuit);
        }
    }
}
