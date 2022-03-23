package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0602;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = 1;

        while (x <= n) {
            System.out.println(x);
            x = (2 * x) + 1;
        }
    }
}
