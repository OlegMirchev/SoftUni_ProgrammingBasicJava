package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double areaCycle = r * r * Math.PI;
        double tourCycle = 2 * r * Math.PI;

        System.out.printf("%.2f%n", areaCycle);
        System.out.printf("%.2f", tourCycle);
    }
}
