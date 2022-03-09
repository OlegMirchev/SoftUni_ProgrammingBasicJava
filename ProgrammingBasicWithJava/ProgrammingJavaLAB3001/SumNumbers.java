package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB3001;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int numb1 = Integer.parseInt(scanner.nextLine());
            sum += numb1;
        }
        System.out.println(sum);
    }
}
