package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB1302;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = Integer.parseInt(scanner.nextLine());
        int roomFloor = Integer.parseInt(scanner.nextLine());

        for (int i = floor; i >= 1; i--) {
            for (int j = 0; j < roomFloor; j++) {
                if (i == floor) {
                    System.out.printf("L%d%d ", i, j);
                }else if (i % 2 ==0) {
                    System.out.printf("O%d%d ", i, j);
                }else {
                    System.out.printf("A%d%d ", i, j);
                }

            }
            System.out.println();

        }
    }
}
