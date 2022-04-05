package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB1302;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        boolean isValid = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinations++;
                int result = i + j;
                if (result == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combinations, i, j, result);
                    isValid = true;
                    break;
                }
            }
            if (isValid) {
                break;
            }
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
        }
    }
}
