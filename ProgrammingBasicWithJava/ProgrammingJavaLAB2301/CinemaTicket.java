package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB2301;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days = scanner.nextLine();
        int price = 0;

        switch (days) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                price = 12;
                break;
            case "Wednesday":
            case "Thursday":
                price = 14;
                break;
            case "Saturday":
            case "Sunday":
                price = 16;
                break;
        }
        System.out.println(price);
    }
}
