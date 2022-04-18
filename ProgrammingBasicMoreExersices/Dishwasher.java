package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbBottles = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int quantityPrepa = numbBottles * 750;
        int count = 0;
        int plates = 0;
        int pots = 0;

        while (!command.equals("End")) {
            int numbDishes = Integer.parseInt(command);
            count++;

            if (count % 3 == 0) {
                quantityPrepa -= (numbDishes * 15);
                if (quantityPrepa >= 0) {
                    pots += numbDishes;
                }
            } else {
                quantityPrepa -= (numbDishes * 5);
                if (quantityPrepa >= 0) {
                    plates += numbDishes;
                }
            }
            if (quantityPrepa < 0) {
                break;
            }


            command = scanner.nextLine();
        }
        if (quantityPrepa >= 0) {
            System.out.printf("Detergent was enough!%n" +
                    "%d dishes and %d pots were washed.%n" +
                    "Leftover detergent %d ml.", plates, pots, quantityPrepa);
        }else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(quantityPrepa));
        }
    }
}
