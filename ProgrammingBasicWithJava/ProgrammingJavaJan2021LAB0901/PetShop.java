package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0901;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int animals = Integer.parseInt(scanner.nextLine());

        double priceDogs = dogs * 2.50;
        double priceAnimals = animals * 4;
        double totalPrice = priceDogs + priceAnimals;

        System.out.printf("%f lv.", totalPrice);

    }
}
