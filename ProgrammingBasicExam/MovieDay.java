package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int photos = Integer.parseInt(scanner.nextLine());
        int numbScenes = Integer.parseInt(scanner.nextLine());
        int timePerScene = Integer.parseInt(scanner.nextLine());

        double location = photos * 0.15;
        double timeScenes = numbScenes * timePerScene;
        double neededTime = location + timeScenes;

        if (photos >= neededTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", photos - neededTime);
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.abs(photos - neededTime));
        }
    }
}
