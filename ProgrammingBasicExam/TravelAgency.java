package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String packet = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        boolean isValid = false;

        if (city.equals("Bansko") || city.equals("Borovets")) {
            switch (packet) {
                case "withEquipment":
                    price = 100;
                    if (vip.equals("yes")) {
                        price *= 0.90;
                    }
                    isValid = true;
                    break;
                case "noEquipment":
                    price = 80;
                    if (vip.equals("yes")) {
                        price *= 0.95;
                    }
                    isValid = true;
                    break;
            }
        } else if (city.equals("Varna") || city.equals("Burgas")) {
            switch (packet) {
                case "withBreakfast":
                    price = 130;
                    if (vip.equals("yes")) {
                        price *= 0.88;
                    }
                    isValid = true;
                    break;
                case "noBreakfast":
                    price = 100;
                    if (vip.equals("yes")) {
                        price *= 0.93;
                    }
                    isValid = true;
                    break;
            }
        }
        if (days > 7) {
            days--;
        }
        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else if (isValid) {
            price *= days;
            System.out.printf("The price is %.2flv! Have a nice time!", price);
        }else {
            System.out.println("Invalid input!");
        }
    }
}
