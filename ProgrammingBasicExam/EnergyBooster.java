package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruits = scanner.nextLine();
        String sizeSet = scanner.nextLine();
        int numberSet = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (sizeSet.equals("small")) {
            switch (fruits) {
                case "Watermelon":
                    price = 56;
                    break;
                case "Mango":
                    price = 36.66;
                    break;
                case "Pineapple":
                    price = 42.10;
                    break;
                case "Raspberry":
                    price = 20;
                    break;
            }
            price *= 2;
        }else {
            switch (fruits) {
                case "Watermelon":
                    price = 28.70;
                    break;
                case "Mango":
                    price = 19.60;
                    break;
                case "Pineapple":
                    price = 24.80;
                    break;
                case "Raspberry":
                    price = 15.20;
                    break;
            }
            price *= 5;
        }
        double priceSet = numberSet * price;
        if (priceSet >= 400 && priceSet <= 1000) {
            priceSet *= 0.85;
        }else if (priceSet > 1000) {
            priceSet *= 0.50;
        }
        System.out.printf("%.2f lv.", priceSet);
    }
}
