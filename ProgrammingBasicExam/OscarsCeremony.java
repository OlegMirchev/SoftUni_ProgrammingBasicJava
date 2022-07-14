package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentHall = Integer.parseInt(scanner.nextLine());

        double statues = rentHall * 0.70;
        double catering = statues * 0.85;
        double sound = catering / 2;
        double totalPrice = rentHall + statues + catering + sound;

        System.out.printf("%.2f", totalPrice);
    }
}
