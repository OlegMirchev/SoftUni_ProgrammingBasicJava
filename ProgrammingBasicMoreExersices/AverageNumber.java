package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sumNumber = 0.0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sumNumber += number;
        }
        sumNumber /= n;

        System.out.printf("%.2f", sumNumber);
    }
}
