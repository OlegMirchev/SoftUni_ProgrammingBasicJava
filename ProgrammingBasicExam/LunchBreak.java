package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameSerial = scanner.nextLine();
        int runEpisode = Integer.parseInt(scanner.nextLine());
        int runBreak = Integer.parseInt(scanner.nextLine());

        double timeLunch = runBreak * 1.00 * 1 / 8;
        double timeBreak = runBreak * 1.00 * 1 / 4;
        double remainsTime = runBreak - timeLunch - timeBreak;

        if (remainsTime >= runEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSerial, Math.ceil(remainsTime - runEpisode));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameSerial, Math.ceil(runEpisode - remainsTime));
        }
    }
}
