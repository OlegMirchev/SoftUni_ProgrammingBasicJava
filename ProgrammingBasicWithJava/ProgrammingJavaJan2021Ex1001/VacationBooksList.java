package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1001;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sheetsOfBook = Integer.parseInt(scanner.nextLine());
        int sheetsForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursBook = sheetsOfBook / sheetsForHour;
        int totalHours = hoursBook / days;

        System.out.println(totalHours);
    }
}
