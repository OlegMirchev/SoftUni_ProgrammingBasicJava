package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1001;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());

        double reg = rad * 180 / Math.PI;

        System.out.printf("%.0f", reg);
    }
}
