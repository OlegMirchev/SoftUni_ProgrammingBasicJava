package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPen = Integer.parseInt(scanner.nextLine());
        int numberMarkers = Integer.parseInt(scanner.nextLine());
        double preparationLitres = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pens = numberPen * 5.80;
        double markers = numberMarkers * 7.20;
        double cleaningPreparation = preparationLitres * 1.20;
        double sumMaterials = pens + markers + cleaningPreparation;
        double totalSum = sumMaterials - (sumMaterials * discount / 100);

        System.out.printf("%.3f", totalSum);
    }
}
