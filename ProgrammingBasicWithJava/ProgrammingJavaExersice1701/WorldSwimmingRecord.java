package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1701;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSec = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double timeOfSec1m = Double.parseDouble(scanner.nextLine());

        double swimMetres = metres * timeOfSec1m;
        double delay = Math.floor(metres / 15) * 12.5;
        double generalTime = swimMetres + delay;

        if (recordSec > generalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", generalTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", generalTime - recordSec);
        }
    }
}
