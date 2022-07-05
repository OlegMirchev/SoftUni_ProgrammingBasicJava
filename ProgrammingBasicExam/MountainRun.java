package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double second = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double timeSeconds1M = Double.parseDouble(scanner.nextLine());

        double neededSec = metres * timeSeconds1M;
        double delay = Math.floor(metres / 50) * 30;
        double generalTime = neededSec + delay;

        if (second > generalTime) {
            System.out.printf("Yes! The new record is %.2f seconds.", generalTime);
        }else {
            System.out.printf("No! He was %.2f seconds slower.", generalTime - second);
        }
    }
}
