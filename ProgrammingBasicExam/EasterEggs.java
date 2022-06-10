package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbPaintEggs = Integer.parseInt(scanner.nextLine());
        int countRed = 0;
        int countOrange = 0;
        int countBlue = 0;
        int countGreen = 0;
        String paint = "";
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= numbPaintEggs; i++) {
            String paintEggs = scanner.nextLine();

            switch (paintEggs) {
                case "red":
                    countRed++;
                    if (countRed > max) {
                        max = countRed;
                        paint = paintEggs;
                    }
                    break;
                case "orange":
                    countOrange++;
                    if (countOrange > max) {
                        max = countOrange;
                        paint = paintEggs;
                    }
                    break;
                case "blue":
                    countBlue++;
                    if (countBlue > max) {
                        max = countBlue;
                        paint = paintEggs;
                    }
                    break;
                case "green":
                    countGreen++;
                    if (countGreen > max) {
                        max = countGreen;
                        paint = paintEggs;
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", countRed);
        System.out.printf("Orange eggs: %d%n", countOrange);
        System.out.printf("Blue eggs: %d%n", countBlue);
        System.out.printf("Green eggs: %d%n", countGreen);
        System.out.printf("Max eggs: %d -> %s", max, paint);
    }
}
