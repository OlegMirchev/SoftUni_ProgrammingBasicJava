package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int numberWalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int generalMinutes = numberWalks * minutesWalk;
        int burntCalories = generalMinutes * 5;
        int caloriesForDay = calories / 2;

        if (burntCalories >= caloriesForDay) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burntCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burntCalories);
        }
    }
}
