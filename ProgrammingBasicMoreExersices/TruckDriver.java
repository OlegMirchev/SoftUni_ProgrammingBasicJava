package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seasons = scanner.nextLine();
        double kmOnMonth = Double.parseDouble(scanner.nextLine());

        if (kmOnMonth <= 5000) {
            switch (seasons) {
                case "Spring":
                case "Autumn":
                    kmOnMonth *= 0.75;
                    break;
                case "Summer":
                    kmOnMonth *= 0.90;
                    break;
                case "Winter":
                    kmOnMonth *= 1.05;
                    break;
            }
        }else if (kmOnMonth <= 10000) {
            switch (seasons) {
                case "Spring":
                case "Autumn":
                    kmOnMonth *= 0.95;
                    break;
                case "Summer":
                    kmOnMonth *= 1.10;
                    break;
                case "Winter":
                    kmOnMonth *= 1.25;
                    break;
            }
        }else {
            switch (seasons) {
                case "Spring":
                case "Autumn":
                case "Summer":
                case "Winter":
                    kmOnMonth *= 1.45;
                    break;
            }
        }
        double salary = (kmOnMonth * 4) * 0.90;

        System.out.printf("%.2f", salary);
    }
}
