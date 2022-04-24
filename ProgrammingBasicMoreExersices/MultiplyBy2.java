package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1000;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (number >= 0) {
                number *= 2;
                System.out.printf("Result: %.2f%n", number);
            }else {
                System.out.println("Negative number!");
                break;
            }
        }
    }
}
