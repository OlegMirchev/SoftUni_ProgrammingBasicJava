package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        String packetFilm = scanner.nextLine();
        int numbTickets = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (film.equals("John Wick")) {
            switch (packetFilm) {
                case "Drink":
                    price = 12;
                    price *= numbTickets;
                    break;
                case "Popcorn":
                    price = 15;
                    price *= numbTickets;
                    break;
                case "Menu":
                    price = 19;
                    price *= numbTickets;
                    break;
            }
        }else if (film.equals("Star Wars")) {
            switch (packetFilm) {
                case "Drink":
                    price = 18;
                    price *= numbTickets;
                    break;
                case "Popcorn":
                    price = 25;
                    price *= numbTickets;
                    break;
                case "Menu":
                    price = 30;
                    price *= numbTickets;
                    break;
            }
        }else if (film.equals("Jumanji")) {
            switch (packetFilm) {
                case "Drink":
                    price = 9;
                    price *= numbTickets;
                    break;
                case "Popcorn":
                    price = 11;
                    price *= numbTickets;
                    break;
                case "Menu":
                    price = 14;
                    price *= numbTickets;
                    break;
            }
        }
        if (film.equals("Star Wars") && numbTickets >= 4) {
            price *= 0.70;
        }else if (film.equals("Jumanji") && numbTickets == 2) {
            price *= 0.85;
        }
        System.out.printf("Your bill is %.2f leva.", price);
    }
}
