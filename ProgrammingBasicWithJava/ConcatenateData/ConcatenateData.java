package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0901;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", name, lastName, age, city);
    }
}
