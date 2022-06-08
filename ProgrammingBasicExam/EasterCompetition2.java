package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterCompetition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbEasterBake = Integer.parseInt(scanner.nextLine());
        String finalName = "";
        int maxPoints = Integer.MIN_VALUE;

        for (int i = 1; i <= numbEasterBake; i++) {
            String nameCooker = scanner.nextLine();
            String rating = scanner.nextLine();
            int point = 0;
            while (!rating.equals("Stop")) {
                int ratingOnePerson = Integer.parseInt(rating);
                point += ratingOnePerson;
                rating = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", nameCooker, point);
            if (point > maxPoints) {
                maxPoints = point;
                finalName = nameCooker;
                System.out.printf("%s is the new number 1!%n", finalName);
            }
        }
        System.out.printf("%s won competition with %d points!", finalName, maxPoints);
    }
}
