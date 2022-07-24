package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serial = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeWithoutAd = Double.parseDouble(scanner.nextLine());

        double adPerEpisode = episodeWithoutAd * 0.20;
        double runAd = episodeWithoutAd + adPerEpisode;
        double specialEpisode = seasons * 10;
        double allTime = runAd * episodes * seasons + specialEpisode;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", serial, Math.floor(allTime));
    }
}
