package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.PBMoreExercieseConditionalStatements;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double foodDogKg = Double.parseDouble(scanner.nextLine());
        double foodCatKg = Double.parseDouble(scanner.nextLine());
        double foodTurtleGram = Double.parseDouble(scanner.nextLine());

        double neededFoodDog = days * foodDogKg;
        double neededFoodCat = days * foodCatKg;
        double neededFoodTurtle = days * (foodTurtleGram / 1000);
        double totalFoodKg = neededFoodDog + neededFoodCat + neededFoodTurtle;

        if (totalFoodKg <= foodKg) {
            double left = foodKg - totalFoodKg;
            System.out.printf("%.0f kilos of food left.", Math.floor(left));
        }else {
            double needed = totalFoodKg - foodKg;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(needed));
        }

    }
}
