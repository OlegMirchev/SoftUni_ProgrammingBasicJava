package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbDays = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalFee = 0.0;

        for (int i = 1; i <= numbDays; i++) {
            double fee = 0.0;
            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    fee += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    fee += 1.25;
                } else {
                    fee += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, fee);
            totalFee += fee;
        }
        System.out.printf("Total: %.2f leva", totalFee);
    }
}
