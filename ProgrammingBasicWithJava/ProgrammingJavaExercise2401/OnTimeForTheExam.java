package ProgrammingBasic2021.TasksFromExercise.ProgammingJavaJan2021Ex2401;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());
        String time = "";

        int examHourMin = examHour * 60 + examMin;
        int arriveHourMin = arriveHour * 60 + arriveMin;
        int totalMin = Math.abs(examHourMin - arriveHourMin);

        if (arriveHourMin < examHourMin - 30) {
            time = "Early";
            System.out.println(time);
            if (totalMin < 60) {
                System.out.printf("%d minutes before the start", totalMin);
            } else {
                int hour = totalMin / 60;
                int minutes = totalMin % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        } else if (arriveHourMin <= examHourMin) {
            time = "On time";
            if (totalMin < 60) {
                System.out.println(time);
                System.out.printf("%d minutes before the start", totalMin);
            }
        } else if (arriveHourMin > examHourMin) {
            time = "Late";
            System.out.println(time);
            if (totalMin < 60) {
                System.out.printf("%d minutes after the start", totalMin);
            }else {
                int hour = totalMin / 60;
                int minutes = totalMin % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        }
    }
}

