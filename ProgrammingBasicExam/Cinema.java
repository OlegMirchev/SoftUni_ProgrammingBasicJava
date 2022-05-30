package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacityHall = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int totalPriceTickets = 0;
        int totalSeats = 0;
        boolean isValid = false;

        while (!command.equals("Movie time!")) {
            int numbPeopleInCinema = Integer.parseInt(command);
            int priceTickets = 0;
            priceTickets = numbPeopleInCinema * 5;
            if (numbPeopleInCinema % 3 == 0) {
                priceTickets -= 5;
            }
            totalSeats += numbPeopleInCinema;

            if (totalSeats > capacityHall) {
                isValid = true;
                break;
            }
            totalPriceTickets += priceTickets;
            command = scanner.nextLine();
        }
        if (isValid) {
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %d lv.", totalPriceTickets);
        }else {
            System.out.printf("There are %d seats left in the cinema.%n" +
                    "Cinema income - %d lv.", capacityHall - totalSeats, totalPriceTickets);

        }
    }
}
