package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB1302;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFilm = scanner.nextLine();
        int totalTickets = 0;
        double studentCounter = 0.0;
        double standardCounter = 0.0;
        double kidCounter = 0.0;

        while (!nameFilm.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int ticketsFilm = 0;
            int countFree = freeSeats;

            while (countFree > 0) {
                String typeTickets = scanner.nextLine();
                if (typeTickets.equals("End")) {
                    break;
                }
                int student = 0;
                int standard = 0;
                int kid = 0;

                switch (typeTickets) {
                    case "student":
                        student++;
                        ticketsFilm += student;
                        studentCounter++;
                        break;
                    case "standard":
                        standard++;
                        ticketsFilm += standard;
                        standardCounter++;
                        break;
                    case "kid":
                        kid++;
                        ticketsFilm += kid;
                        kidCounter++;
                        break;
                }
                countFree--;
            }
            double hall = ticketsFilm * 1.00 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", nameFilm, hall);
            totalTickets += ticketsFilm;
            nameFilm = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCounter / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCounter / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidCounter / totalTickets * 100);
    }
}
