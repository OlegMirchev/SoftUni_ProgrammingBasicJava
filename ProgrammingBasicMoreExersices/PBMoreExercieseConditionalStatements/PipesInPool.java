package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.PBMoreExercieseConditionalStatements;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double full = 0.0;
        String output = "";

        double p1Full = p1 * h;
        double p2Full = p2 * h;
        double general = p1Full + p2Full;

        if (general <= v) {
            full = (general / v) * 100;
            double p1Rebound = (p1Full / general) * 100;
            double p2Rebound = (p2Full / general) * 100;
            output = String.format("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2:%n" +
                    " %.2f%%.", full, p1Rebound, p2Rebound);
        } else {
            double overflow = general - v;
            output = String.format("For %.2f hours the pool overflows with %.2f%n" +
                    " liters.", h, Math.abs(overflow));
        }
        System.out.println(output);
    }
}
