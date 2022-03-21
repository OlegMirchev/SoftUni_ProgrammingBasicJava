package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0602;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int volumeBoxes = 0;
        int volumeRoom = w * l * h;


        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);
            volumeBoxes += boxes;
            if (volumeRoom <= volumeBoxes) {
                break;
            }
            command = scanner.nextLine();
        }
        if (volumeRoom <= volumeBoxes) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volumeRoom - volumeBoxes));
        }else {
            System.out.printf("%d Cubic meters left.", volumeRoom - volumeBoxes);
        }
    }
}
