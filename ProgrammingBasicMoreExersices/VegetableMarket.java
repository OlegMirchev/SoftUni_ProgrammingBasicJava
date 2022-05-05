package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int four = Integer.parseInt(scanner.nextLine());

        double priceVeg = first * third;
        double priceFruit = second * four;
        double totalPrice = priceVeg + priceFruit;
        double euro = totalPrice / 1.94;

        System.out.printf("%.2f", euro);

    }
}
