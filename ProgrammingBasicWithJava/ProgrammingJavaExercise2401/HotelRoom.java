package ProgrammingBasic2021.TasksFromExercise.ProgammingJavaJan2021Ex2401;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0.0;
        double apartment = 0.0;

        switch (month) {
            case "May":
            case "October":
                studio = nights * 50;
                apartment = nights * 65;
                if (nights > 7 && nights < 14) {
                    studio *= 0.95;
                }else if (nights > 14) {
                    studio *= 0.70;
                    apartment *= 0.90;
                }
                break;
            case "June":
            case "September":
                studio = nights * 75.20;
                apartment = nights * 68.70;
                if (nights > 14) {
                   studio *= 0.80;
                   apartment *= 0.90;
                }
                break;
            case "July":
            case "August":
                studio = nights * 76;
                apartment = nights * 77;
                if (nights > 14) {
                    apartment *= 0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
