package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0602;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!command.equals("Stop")) {
            int number = Integer.parseInt(command);
            if (max < number) {
                max = number;
            }
            command = scanner.nextLine();
        }
        System.out.println(max);
    }
}
