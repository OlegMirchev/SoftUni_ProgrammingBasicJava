package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex0702;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumChange = Double.parseDouble(scanner.nextLine());
        int coins = 0;
        sumChange = Math.floor(sumChange * 100);

        while (sumChange > 0) {
            if (sumChange >= 200) {
                coins++;
                sumChange -= 200;
            }else if (sumChange >= 100) {
                coins++;
                sumChange -= 100;
            }else if (sumChange >= 50) {
                coins++;
                sumChange -= 50;
            }else if (sumChange >= 20) {
                coins++;
                sumChange -= 20;
            }else if (sumChange >= 10) {
                coins++;
                sumChange -= 10;
            }else if (sumChange >= 5) {
                coins++;
                sumChange -= 5;
            }else if (sumChange >= 2) {
                coins++;
                sumChange -= 2;
            }else if (sumChange >= 1) {
                coins++;
                sumChange -= 1;
            }
        }
        System.out.println(coins);
    }
}
