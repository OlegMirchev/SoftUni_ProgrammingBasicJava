package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFilms = scanner.nextLine();
        int maxPointsFilm = Integer.MIN_VALUE;
        int countFilm = 0;
        String finalNameFilm = "";
        boolean isValid = false;

        while (!nameFilms.equals("STOP")) {
            countFilm++;
            int totalSum = 0;

            for (int i = 0; i < nameFilms.length(); i++) {
                char symbol = nameFilms.charAt(i);

                if (Character.isLowerCase(symbol)) {
                    symbol -= (nameFilms.length() * 2);
                } else if (Character.isUpperCase(symbol)) {
                    symbol -= nameFilms.length();
                }
                totalSum += symbol;
            }
            if (totalSum > maxPointsFilm) {
                maxPointsFilm = totalSum;
                finalNameFilm = nameFilms;
            }
            if (countFilm >= 7) {
                isValid = true;
                break;
            }
            nameFilms = scanner.nextLine();
        }
        if (isValid) {
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", finalNameFilm, maxPointsFilm);
    }
}
