package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbEasterBake = Integer.parseInt(scanner.nextLine());
        String finalName = "";
        int maxPoints = Integer.MIN_VALUE;

        for (int i = 1; i <= numbEasterBake; i++) {
            String nameCooker = scanner.nextLine();
            String name = nameCooker;
            int point = 0;
            while (!nameCooker.equals("Stop")) {
                nameCooker = scanner.nextLine();
                if (nameCooker.equals("Stop")) {
                    break;
                }
                int ratingOnePerson = Integer.parseInt(nameCooker);
                point += ratingOnePerson;
            }
            System.out.printf("%s has %d points.%n", name, point);
            if (point > maxPoints) {
                maxPoints = point;
                finalName = name;
                System.out.printf("%s is the new number 1!%n", name);
            }
        }
        System.out.printf("%s won competition with %d points!", finalName, maxPoints);
    }
}
