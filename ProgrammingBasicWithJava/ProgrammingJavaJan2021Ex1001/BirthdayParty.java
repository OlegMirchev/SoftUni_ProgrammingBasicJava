package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1001;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentHall = Integer.parseInt(scanner.nextLine());

        double cake = rentHall * 0.20;
        double drinks = cake * 0.55;
        double animator = rentHall * 1.00 / 1 / 3;
        double budget = rentHall + cake + drinks + animator;

        System.out.println(budget);
    }
}
