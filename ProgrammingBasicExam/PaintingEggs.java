package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizeEggs = scanner.nextLine();
        String colorEggs = scanner.nextLine();
        int numbers = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (sizeEggs.equals("Large")) {
            switch (colorEggs) {
                case "Red":
                    price = 16;
                    break;
                case "Green":
                    price = 12;
                    break;
                case "Yellow":
                    price = 9;
                    break;
            }
        }else if (sizeEggs.equals("Medium")) {
            switch (colorEggs) {
                case "Red":
                    price = 13;
                    break;
                case "Green":
                    price = 9;
                    break;
                case "Yellow":
                    price = 7;
                    break;
            }
        }else if (sizeEggs.equals("Small")) {
            switch (colorEggs) {
                case "Red":
                    price = 9;
                    break;
                case "Green":
                    price = 8;
                    break;
                case "Yellow":
                    price = 5;
                    break;
            }
        }
        double totalSum = (numbers * price) * 0.65;
        System.out.printf("%.2f leva.", totalSum);
    }
}
