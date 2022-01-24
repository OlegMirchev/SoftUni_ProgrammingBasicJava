package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB1601;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        boolean isValid = number % 2 == 0;
        if (isValid) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
