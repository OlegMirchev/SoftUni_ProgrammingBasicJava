package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex3101;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int diff = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max) {
                max = number;

            }
        }
        sum -= max;
        if (max == sum) {
            System.out.printf("Yes%n" +
                    "Sum = %d", max);
        }else {
            diff = Math.abs(max - sum);
            System.out.printf("No%n" +
                    "Diff = %d", diff);
        }
    }
}
