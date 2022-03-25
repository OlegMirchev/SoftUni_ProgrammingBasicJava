package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex0702;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int numbPieces = w * l;
        boolean isValid = false;

        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            numbPieces -= pieces;
            if (numbPieces <= 0) {
                isValid = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(numbPieces));
        }else {
            System.out.printf("%d pieces are left.", numbPieces);
        }
    }
}
