package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wMetres = Double.parseDouble(scanner.nextLine());
        double hMetres = Double.parseDouble(scanner.nextLine());
        double hall = 100;

        double hCm = hMetres * 100;
        double wCm = wMetres * 100;
        double tableDesk = Math.floor((hCm - hall) / 70);
        double row = Math.floor(wCm / 120);
        double totalPlaces = tableDesk * row - 3;

        System.out.println(totalPlaces);

    }
}
