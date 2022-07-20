package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightWall = Integer.parseInt(scanner.nextLine());
        int widthWall = Integer.parseInt(scanner.nextLine());
        int percentNotPaint = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double generalArea = heightWall * widthWall * 4;
        double wallForPaint = generalArea - (generalArea * percentNotPaint / 100);

        while (!command.equals("Tired!")) {
            int litresPaint = Integer.parseInt(command);
            wallForPaint -= litresPaint;
            if (wallForPaint < 0) {
                break;
            }
            if (wallForPaint == 0) {
                break;
            }

            command = scanner.nextLine();
        }
        if (command.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", Math.ceil(wallForPaint));
        } else if (wallForPaint < 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(wallForPaint));
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");

        }

    }
}
