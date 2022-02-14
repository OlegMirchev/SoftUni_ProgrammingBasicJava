package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB2301;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 0.0;

        if (typeRoom.equals("room for one person")) {
            days -= 1;
            price = days * 18;

        }else if (typeRoom.equals("apartment")) {
            if (days < 10) {
                days -= 1;
                price = days * 25;
                price *= 0.70;
            }else if (days < 15) {
                days -= 1;
                price = days * 25;
                price *= 0.65;

            }else if (days > 15) {
                days -= 1;
                price = days * 25;
                price *= 0.50;

            }

        }else if (typeRoom.equals("president apartment")) {
            if (days < 10) {
                days -= 1;
                price = days * 35;
                price *= 0.90;
            }else if (days < 15) {
                days -= 1;
                price = days * 35;
                price *= 0.85;

            }else if (days > 15) {
                days -= 1;
                price = days * 35;
                price *= 0.80;

            }
        }
        if (rating.equals("positive")) {
            price *= 1.25;
        }else if (rating.equals("negative")) {
            price *= 0.90;
        }
        System.out.printf("%.2f", price);
    }
}
