package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1701;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("mm")) {
            number /= 1000;
        }else if (input.equals("cm")) {
            number /= 100;
        }
        if (output.equals("mm")) {
            number *= 1000;
        }else if (output.equals("cm")) {
            number *= 100;
        }
        System.out.printf("%.3f", number);
    }
}
