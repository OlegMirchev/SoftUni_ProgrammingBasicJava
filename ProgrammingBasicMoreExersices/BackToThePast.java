package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int yearsLive = Integer.parseInt(scanner.nextLine());
        int ageIvan = 19;

        for (int i = 1800; i <= yearsLive ; i++) {
            if (i % 2 == 0) {
                money -= 12000;

            }else {
                money -= (12000 + (ageIvan * 50));
                ageIvan += 2;

            }
        }
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
