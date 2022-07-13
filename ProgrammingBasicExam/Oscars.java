package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int judge = Integer.parseInt(scanner.nextLine());
        boolean isValid = false;

        for (int i = 1; i <= judge; i++) {
            String nameJudge = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());
            double pointsJudges = (nameJudge.length() * pointsFromJudge) / 2;
            pointsAcademy += pointsJudges;
            if (pointsAcademy > 1250.5) {
                isValid = true;
                break;
            }
        }
        if (isValid) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, pointsAcademy);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - pointsAcademy);
        }
    }
}
