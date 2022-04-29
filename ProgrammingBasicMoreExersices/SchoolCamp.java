package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seasons = scanner.nextLine();
        String group = scanner.nextLine();
        int numbChildren = Integer.parseInt(scanner.nextLine());
        int numbNights = Integer.parseInt(scanner.nextLine());
        String sports = "";

        if (group.equals("boys")) {
            switch (seasons) {
                case "Winter":
                    sports = "Judo";
                    break;
                case "Spring":
                    sports = "Tennis";
                    break;
                case "Summer":
                    sports = "Football";
            }

        }else if (group.equals("girls")) {
            switch (seasons) {
                case "Winter":
                    sports = "Gymnastics";
                    break;
                case "Spring":
                    sports = "Athletics";
                    break;
                case "Summer":
                    sports = "Volleyball";
            }

        }else {
            switch (seasons) {
                case "Winter":
                    sports = "Ski";
                    break;
                case "Spring":
                    sports = "Cycling";
                    break;
                case "Summer":
                    sports = "Swimming";
            }
        }
        double price = numbChildren * numbNights;
        if (group.equals("boys") || group.equals("girls")) {
            switch (seasons) {
                case "Winter":
                    price *= 9.60;
                    break;
                case "Spring":
                    price *= 7.20;
                    break;
                case "Summer":
                    price *= 15;
                    break;
            }
        }else {
            switch (seasons) {
                case "Winter":
                    price *= 10;
                    break;
                case "Spring":
                    price *= 9.50;
                    break;
                case "Summer":
                    price *= 20;
                    break;
            }
        }
        if (numbChildren >=10 && numbChildren < 20) {
            price *= 0.95;
        }else if (numbChildren >= 20 && numbChildren < 50) {
            price *= 0.85;
        }else if (numbChildren >= 50) {
            price *= 0.50;
        }
        System.out.printf("%s %.2f lv.", sports, price);
    }
}
