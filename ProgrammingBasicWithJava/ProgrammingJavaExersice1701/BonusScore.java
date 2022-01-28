package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1701;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPoints = Integer.parseInt(scanner.nextLine());
        double bonus = 0.0;
        if (numberPoints <= 100) {
            bonus = 5;
        }else if (numberPoints < 1000) {
            bonus = numberPoints * 0.20;
        }else {
            bonus = numberPoints * 0.10;
        }
        if (numberPoints % 2 == 0) {
            bonus += 1;
        }else if (numberPoints % 10 == 5) {
            bonus += 2;
        }
        System.out.printf("%.2f%n", bonus);
        System.out.printf("%.2f", numberPoints + bonus );
    }
}
