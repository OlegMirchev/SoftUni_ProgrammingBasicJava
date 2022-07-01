package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String instrument = scanner.nextLine();
        double difficult = 0.0;
        double performance = 0.0;

        if (instrument.equals("ribbon")) {
            switch (country) {
                case "Russia":
                    difficult = 9.100;
                    performance = 9.400;
                    break;
                case "Bulgaria":
                    difficult = 9.600;
                    performance = 9.400;
                    break;
                case "Italy":
                    difficult = 9.200;
                    performance = 9.500;
                    break;
            }
        }else if (instrument.equals("hoop")) {
            switch (country) {
                case "Russia":
                    difficult = 9.300;
                    performance = 9.800;
                    break;
                case "Bulgaria":
                    difficult = 9.550;
                    performance = 9.750;
                    break;
                case "Italy":
                    difficult = 9.450;
                    performance = 9.350;
                    break;
            }
        } else if (instrument.equals("rope")) {
            switch (country) {
                case "Russia":
                    difficult = 9.600;
                    performance = 9.000;
                    break;
                case "Bulgaria":
                    difficult = 9.500;
                    performance = 9.400;
                    break;
                case "Italy":
                    difficult = 9.700;
                    performance = 9.150;
                    break;
            }
        }
        double evaluation = difficult + performance;
        double remain = (20 - evaluation) / 20 * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, evaluation, instrument);
        System.out.printf("%.2f%%", remain);
    }
}
