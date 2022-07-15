package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFilm = scanner.nextLine();
        String typeHall = scanner.nextLine();
        double tickets = Double.parseDouble(scanner.nextLine());

        if (nameFilm.equals("A Star Is Born")) {
            switch (typeHall) {
                case "normal":
                    tickets *= 7.50;
                    break;
                case "luxury":
                    tickets *= 10.50;
                    break;
                case "ultra luxury":
                    tickets *= 13.50;
                    break;
            }
        }else if (nameFilm.equals("Bohemian Rhapsody")) {
            switch (typeHall) {
                case "normal":
                    tickets *= 7.35;
                    break;
                case "luxury":
                    tickets *= 9.45;
                    break;
                case "ultra luxury":
                    tickets *= 12.75;
                    break;
            }
        }else if (nameFilm.equals("Green Book")) {
            switch (typeHall) {
                case "normal":
                    tickets *= 8.15;
                    break;
                case "luxury":
                    tickets *= 10.25;
                    break;
                case "ultra luxury":
                    tickets *= 13.25;
                    break;
            }
        }else if (nameFilm.equals("The Favourite")) {
            switch (typeHall) {
                case "normal":
                    tickets *= 8.75;
                    break;
                case "luxury":
                    tickets *= 11.55;
                    break;
                case "ultra luxury":
                    tickets *= 13.95;
                    break;
            }
        }
        System.out.printf("%s -> %.2f lv.", nameFilm, tickets);
    }
}
