package ProgrammingBasic2021.TasksFromExercise.pExam;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbBox = Integer.parseInt(scanner.nextLine());
        int numbTenses = Integer.parseInt(scanner.nextLine());
        double priceGraves = Double.parseDouble(scanner.nextLine());
        double priceBrush = Double.parseDouble(scanner.nextLine());

        double totalSumPaint = 21.50 * numbBox;
        double totalSumTense = 5.20 * numbTenses;
        double neededGraves = Math.ceil(numbTenses * 0.35);
        double neededBrush = Math.floor(numbBox * 0.48);
        double totalPriceGraves = neededGraves * priceGraves;
        double totalPriceBrush = neededBrush * priceBrush;
        double totalProducts = totalSumPaint + totalSumTense + totalPriceGraves + totalPriceBrush;
        double delivery = totalProducts * 1/15;

        System.out.printf("This delivery will cost %.2f lv.", delivery);

    }
}
