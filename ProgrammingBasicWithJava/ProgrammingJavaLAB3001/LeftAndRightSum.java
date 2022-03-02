package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB3001;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            leftSum += number1;
        }
        for (int i = 0; i < n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            rightSum += number1;
        }

        if (rightSum == leftSum) {
            System.out.printf("Yes, sum = %d%n", rightSum);
        }else {
            int diff = Math.abs(rightSum - leftSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
