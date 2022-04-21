package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int treated = 0;
        int untreated = 0;
        int doctor = 7;

        for (int i = 1; i <= n; i++) {
            int numbPatients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && untreated > treated) {
                doctor++;
            }
            if (numbPatients <= doctor) {
                treated += numbPatients;
            }else {
                untreated += numbPatients - doctor;
                treated += doctor;
            }
        }
        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);
    }
}
