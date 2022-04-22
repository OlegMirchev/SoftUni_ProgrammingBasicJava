package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wallArea = x * y;
        double windowArea = 1.5 * 1.5;
        double twoSide = wallArea * 2 - windowArea * 2;
        double behindWall = x * x;
        double input = 2 * 1.2;
        double frontBehindWall = behindWall * 2 - input;
        double totalAreaWall = twoSide + frontBehindWall;
        double greenPaint = totalAreaWall / 3.4;

        double recRoof = (x * y) * 2;
        double trianRoof = (x * h / 2) * 2;
        double totalAreaRoof = recRoof + trianRoof;
        double redPaint = totalAreaRoof / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
