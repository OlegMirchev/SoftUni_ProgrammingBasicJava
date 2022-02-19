package ProgrammingBasic2021.TasksFromExercise.ProgammingJavaJan2021Ex2401;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (projection) {
            case "Premiere":
                price = r * c * 12;
                break;
            case "Normal":
                price = r * c * 7.50;
                break;
            case "Discount":
                price = r * c * 5;
                break;
        }
        System.out.printf("%.2f leva", price);
    }
}
