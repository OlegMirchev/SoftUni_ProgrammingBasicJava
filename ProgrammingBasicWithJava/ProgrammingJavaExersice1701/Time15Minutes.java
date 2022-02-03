package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1701;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int newMin = hour * 60;
        int totalMin = minutes + newMin;
        totalMin += 15;
        int newHour = totalMin / 60;
        int min = totalMin % 60;

        if (newHour > 23) {
            newHour = 0;
        }
        System.out.printf("%d:%02d", newHour, min);
    }
}
