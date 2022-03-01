package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB3001;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numb; i++) {
            if (i % 2 == 0) {
                System.out.println((int)Math.pow(2, i));
            }

        }
    }
}
