package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbDays = Integer.parseInt(scanner.nextLine());
        double quantityFood = Double.parseDouble(scanner.nextLine());
        double eatFoodDogs = 0.0;
        double eatFoodCat = 0.0;
        double eatenBiscuits = 0.0;

        for (int i = 1; i <= numbDays; i++) {
            int dogsFood = Integer.parseInt(scanner.nextLine());
            int catsFood = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                eatenBiscuits += (dogsFood + catsFood) * 0.10;
            }
            eatFoodDogs += dogsFood;
            eatFoodCat += catsFood;
        }
        double foodsDogsAndCats = eatFoodDogs + eatFoodCat;
        double allFoods = (foodsDogsAndCats / quantityFood) * 100;
        double totalEatenFoodDogs = (eatFoodDogs / foodsDogsAndCats) * 100;
        double totalEatenFoodCats = (eatFoodCat / foodsDogsAndCats) * 100;
        System.out.printf("Total eaten biscuits: %.0fgr.%n", eatenBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", allFoods);
        System.out.printf("%.2f%% eaten from the dog.%n", totalEatenFoodDogs);
        System.out.printf("%.2f%% eaten from the cat.", totalEatenFoodCats);

    }
}
