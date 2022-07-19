package ProgrammingBasic2021.TasksFromExercise.pExam;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puppyKG = Integer.parseInt(scanner.nextLine());
        int puppyGr = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        int foodRemains = 0;
        int lackFood = 0;

        while (!input.equals("Adopted")) {
            int totalQuantity = scanner.nextInt(counter);
            if (puppyKG >= puppyGr) {
                puppyGr *= 1000;
                foodRemains = puppyGr - totalQuantity;
                System.out.printf("Food is enough! Leftovers: %d grams.", foodRemains);
            }
            if (puppyKG >= puppyGr) {
                puppyGr *= 1000;
                lackFood = totalQuantity - puppyGr;
                System.out.printf("Food is not enough. You need %d grams more.", lackFood);
            }
            counter++;
            input = scanner.nextLine();
        }
    }
}

