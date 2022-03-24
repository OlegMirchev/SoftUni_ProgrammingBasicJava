package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0602;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < numb1) {
            int numb2 = Integer.parseInt(scanner.nextLine());
            sum += numb2;
        }
        System.out.println(sum);
    }
}
