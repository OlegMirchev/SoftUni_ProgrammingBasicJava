package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees > 4.00 & degrees < 12.00) {
            System.out.println("Cold");
        } else if (degrees > 11.90 & degrees < 15.00) {
            System.out.println("Cool");
        } else if (degrees > 14.90 & degrees < 20.10) {
            System.out.println("Mild");
        } else if (degrees > 20.00 & degrees < 26.00) {
            System.out.println("Warm");
        } else if (degrees > 25.90 & degrees <= 35.00) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
