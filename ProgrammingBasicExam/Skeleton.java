package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesK = Integer.parseInt(scanner.nextLine());
        int secondK = Integer.parseInt(scanner.nextLine());
        double lengthMetres = Double.parseDouble(scanner.nextLine());
        int second100Metres = Integer.parseInt(scanner.nextLine());

        double secondsControl = minutesK * 60 + secondK;
        double delay = (lengthMetres / 120) * 2.5;
        double timeMarin = (lengthMetres / 100) * second100Metres - delay;

        if (secondsControl >= timeMarin) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeMarin);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", timeMarin - secondsControl);
        }

    }
}
