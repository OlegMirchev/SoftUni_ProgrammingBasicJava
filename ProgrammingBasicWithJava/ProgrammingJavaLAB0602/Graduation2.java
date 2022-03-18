package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0602;

import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameStudent = scanner.nextLine();
        int classes = 1;
        int excluded = 0;
        double sum = 0.0;
        boolean isVallid = false;

        while (classes <= 12) {
            double rating = Double.parseDouble(scanner.nextLine());
            if (rating >= 4.00) {
                classes++;
            }else {
                excluded++;
            }
            if (excluded > 1) {
                isVallid = true;
                break;
            }
            sum += rating;
        }
        double average = sum / 12;
        if (isVallid) {
            System.out.printf("%s has been excluded at %d grade", nameStudent, classes);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", nameStudent, average);
        }
    }
}
