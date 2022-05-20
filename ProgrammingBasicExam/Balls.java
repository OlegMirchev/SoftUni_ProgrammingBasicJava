package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int redCounter = 0;
        int orangeCounter = 0;
        int yellowCounter = 0;
        int whiteCounter = 0;
        int blackCounter = 0;
        int otherColour = 0;


        for (int i = 0; i < n; i++) {
            String colour = scanner.nextLine();

            switch (colour) {
                case "red":
                    redCounter++;
                    points += 5;
                    break;
                case "orange":
                    orangeCounter++;
                    points += 10;
                    break;
                case "yellow":
                    yellowCounter++;
                    points += 15;
                    break;
                case "white":
                    whiteCounter++;
                    points += 20;
                    break;
                case "black":
                    blackCounter++;
                    points /= 2;
                    break;
            }
            if (!(colour.equals("red") || colour.equals("orange") || colour.equals("yellow") ||
                    colour.equals("white") || colour.equals("black"))) {
                otherColour++;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Points from red balls: %d%n", redCounter);
        System.out.printf("Points from orange balls: %d%n", orangeCounter);
        System.out.printf("Points from yellow balls: %d%n", yellowCounter);
        System.out.printf("Points from white balls: %d%n", whiteCounter);
        System.out.printf("Other colors picked: %d%n", otherColour);
        System.out.printf("Divides from black balls: %d", blackCounter);
    }
}
