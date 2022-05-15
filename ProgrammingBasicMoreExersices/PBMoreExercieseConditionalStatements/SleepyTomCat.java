package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.PBMoreExercieseConditionalStatements;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hollyDays = Integer.parseInt(scanner.nextLine());
        // Пример: 20 почивни дни -> работните дни са 345 (365 – 20 = 245).
        // Реалното време за игра е 24 275 минути (345 * 63 + 20 *127).
        // Разликата от нормата е 5 725 минути (30 000 – 24 275 = 5 725) или 95 часа и 25 минути.

        int workDay = 365 - hollyDays;
        int gameMin =(workDay * 63 + hollyDays * 127);
        int norm = 30000 - gameMin;
        int hour = Math.abs(norm / 60);
        int min = Math.abs(norm % 60);

        if (30000 > gameMin) {
            System.out.printf("Tom sleeps well%n" +
                    "%d hours and %d minutes less for play", hour, min);
        }else {
            System.out.printf("Tom will run away%n" +
                    "%d hours and %d minutes more for play",hour, min);
        }
    }
}
