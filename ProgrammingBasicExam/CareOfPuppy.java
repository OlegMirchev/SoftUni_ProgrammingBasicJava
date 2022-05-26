package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityFoodKG = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        quantityFoodKG *= 1000;
        int allQuantityFood = 0;

        while (!command.equals("Adopted")) {
            int sumFood = Integer.parseInt(command);
            allQuantityFood += sumFood;

            command = scanner.nextLine();
        }
        if (allQuantityFood <= quantityFoodKG) {
            System.out.printf("Food is enough! Leftovers: %d grams.", quantityFoodKG - allQuantityFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(quantityFoodKG - allQuantityFood));
        }
    }
}
