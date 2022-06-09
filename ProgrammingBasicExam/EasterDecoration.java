package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbClients = Integer.parseInt(scanner.nextLine());
         double totalSum = 0.0;

        for (int i = 1; i <= numbClients; i++) {
            String command = scanner.nextLine();
            double sum = 0.0;
            int countProducts = 0;
            while (!command.equals("Finish")) {
                String products = command;
                countProducts++;
                switch (products) {
                    case "basket":
                        sum += 1.50;
                        break;
                    case "wreath":
                        sum += 3.80;
                        break;
                    case "chocolate bunny":
                        sum += 7;
                        break;
                }
                command = scanner.nextLine();
            }
            if (countProducts % 2 == 0) {
                sum *= 0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n",countProducts, sum);
            totalSum += sum;
        }
        double averageBill = totalSum / numbClients;
        System.out.printf("Average bill per client is: %.2f leva.", averageBill);
    }
}
