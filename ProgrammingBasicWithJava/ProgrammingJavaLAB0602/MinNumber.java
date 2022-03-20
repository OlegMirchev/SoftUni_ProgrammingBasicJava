package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0602;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int min = Integer.MAX_VALUE;

        while (!command.equals("Stop")) {
            int number = Integer.parseInt(command);
            if (min > number) {
                min = number;
            }
            command = scanner.nextLine();
        }
        System.out.println(min);
    }
}
