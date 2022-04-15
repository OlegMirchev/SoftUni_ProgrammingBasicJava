package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String typeRace = scanner.nextLine();
        double sumJuniors = 0.0;
        double sumSeniors = 0.0;
        int countCross = 0;

        switch (typeRace) {
            case "trail":
                sumJuniors = juniors * 5.5;
                sumSeniors = seniors * 7;
                break;
            case "cross-country":
                countCross = juniors + seniors;
                sumJuniors = juniors * 8;
                sumSeniors = seniors * 9.50;
                break;
            case "downhill":
                sumJuniors = juniors * 12.25;
                sumSeniors = seniors * 13.75;
                break;
            case "road":
                sumJuniors = juniors * 20;
                sumSeniors = seniors * 21.50;
                break;
        }
        double totalSum = sumJuniors + sumSeniors;
        totalSum *= 0.95;
        if (countCross >= 50) {
            totalSum *= 0.75;
        }
        System.out.printf("%.2f", totalSum);
    }
}
