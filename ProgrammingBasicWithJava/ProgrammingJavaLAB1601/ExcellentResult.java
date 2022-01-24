package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB1601;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());

        if (numb >= 5) {
            System.out.println("Excellent!");
        }
    }
}
