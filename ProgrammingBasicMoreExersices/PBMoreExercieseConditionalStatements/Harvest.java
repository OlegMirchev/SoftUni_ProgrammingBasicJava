package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.PBMoreExercieseConditionalStatements;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int numbWorker = Integer.parseInt(scanner.nextLine());

        double allGrapes = x * y;
        double litresWine = (allGrapes * 0.40) / 2.5;
        double left = Math.abs(litresWine - z);
        double litesPerPerson = left / numbWorker;

        if (litresWine >= z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" +
                    "%.0f liters left -> %.0f liters per person.", Math.floor(litresWine), Math.ceil(left), Math.ceil(litesPerPerson));
        }else if (litresWine < z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(left));
        }

    }
}
