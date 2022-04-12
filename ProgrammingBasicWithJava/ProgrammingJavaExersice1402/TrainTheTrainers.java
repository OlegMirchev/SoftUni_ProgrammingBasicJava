package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1402;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String namePresent = scanner.nextLine();
        double ratingCount = 0;
        double allRating = 0;
        double sumRating = 0;

        while (!namePresent.equals("Finish")) {
            sumRating = 0;
            for (int ratingCounter = 0; ratingCounter < n; ratingCounter++) {
                double rating = Double.parseDouble(scanner.nextLine());
                allRating += rating;
                sumRating += rating / n;
                ratingCount++;

            }
            System.out.printf("%s - %.2f.%n", namePresent, sumRating);


            namePresent = scanner.nextLine();
        }

        double average = allRating / ratingCount;
        System.out.printf("Student's final assessment is %.2f.", average);

    }
}
