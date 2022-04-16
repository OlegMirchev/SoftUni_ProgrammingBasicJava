package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String seasons = scanner.nextLine();
        String typeClass = "";
        String typeCar = "";


        if (budget <= 100) {
            typeClass = "Economy class";
            switch (seasons) {
                case "Summer":
                    typeCar = "Cabrio";
                    budget *= 0.35;
                    break;
                case "Winter":
                    typeCar = "Jeep";
                    budget *= 0.65;
                    break;
            }
        } else if (budget <= 500) {
            typeClass = "Compact class";
            switch (seasons) {
                case "Summer":
                    typeCar = "Cabrio";
                    budget *= 0.45;
                    break;
                case "Winter":
                    typeCar = "Jeep";
                    budget *= 0.80;
                    break;
            }
        } else {
            typeClass = "Luxury class";
            typeCar = "Jeep";
            budget *= 0.90;
        }
        System.out.printf("%s%n", typeClass);
        System.out.printf("%s - %.2f", typeCar, budget);
    }
}
