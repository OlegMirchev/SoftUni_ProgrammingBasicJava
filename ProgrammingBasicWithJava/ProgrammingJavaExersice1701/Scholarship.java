package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1701;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double average = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double social = 0.0;
        double excellent = 0.0;
        boolean isValid = false;

        if (income < minSalary && average > 4.50) {
            social = Math.floor(minSalary * 0.35);
            isValid = true;
        }
        if (average >= 5.50) {
            excellent = Math.floor(average * 25);
            isValid = true;
        }
        if (!isValid) {
            System.out.println("You cannot get a scholarship!");
        }else if (social > excellent) {
            System.out.printf("You get a Social scholarship %.0f BGN", social);
        }else {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellent);
        }

    }
}