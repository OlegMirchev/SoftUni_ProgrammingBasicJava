package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentBasketball = Integer.parseInt(scanner.nextLine());

        double shoes = rentBasketball * 0.60;
        double outfit = shoes * 0.80;
        double ball = outfit * 1 / 4;
        double others = ball * 1 / 5;
        double totalSum = rentBasketball + shoes + outfit + ball + others;

        System.out.printf("%.2f", totalSum);
    }
}
