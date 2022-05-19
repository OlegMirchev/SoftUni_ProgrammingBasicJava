package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbJoinery = Integer.parseInt(scanner.nextLine());
        String typeJoinery = scanner.nextLine();
        String receive = scanner.nextLine();
        double price = 0.0;


        switch (typeJoinery) {
            case "90X130":
                price = 110 * numbJoinery;
                if (numbJoinery > 30 && numbJoinery < 60) {
                    price *= 0.95;
                } else if (numbJoinery > 60) {
                    price *= 0.92;
                }
                break;
            case "100X150":
                price = 140 * numbJoinery;
                if (numbJoinery > 40 && numbJoinery < 80) {
                    price *= 0.94;
                } else if (numbJoinery > 80) {
                    price *= 0.90;
                }
                break;
            case "130X180":
                price = 190 * numbJoinery;
                if (numbJoinery > 20 && numbJoinery < 50) {
                    price *= 0.93;
                } else if (numbJoinery > 50) {
                    price *= 0.88;
                }
                break;
            case "200X300":
                price = 250 * numbJoinery;
                if (numbJoinery > 25 && numbJoinery < 50) {
                    price *= 0.91;
                } else if (numbJoinery > 50) {
                    price *= 0.86;
                }
                break;
        }
        if (receive.equals("With delivery")) {
            price += 60;
        }
        if (numbJoinery > 99) {
            price *= 0.96;
        }
        if (numbJoinery > 10) {
            System.out.printf("%.2f BGN", price);
        }else {
            System.out.println("Invalid order");
        }
    }
}
