package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex0702;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int excludedRating = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int sumRating = 0;
        int count = 0;
        int countProblems = 0;
        String lastProblems = "";
        boolean isValid = false;

        while (!command.equals("Enough")){
            int rating = Integer.parseInt(scanner.nextLine());
            sumRating += rating;
            countProblems++;
            if (rating <= 4.00) {
                count++;
            }
            if (count >= excludedRating) {
                isValid = true;
                break;
            }
            lastProblems = command;
            command = scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("You need a break, %d poor grades.", count);
        }else {
            double average = 1.00 * sumRating / countProblems;
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", average, countProblems, lastProblems);
        }


    }
}
