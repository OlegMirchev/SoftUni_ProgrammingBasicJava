package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB1601;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());

        if (numb1 >= numb2) {
            System.out.println(numb1);
        } else if (numb1 <= numb2) {
            System.out.println(numb2);
        }
    }
}
