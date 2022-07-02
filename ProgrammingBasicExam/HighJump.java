package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightCM = Integer.parseInt(scanner.nextLine());
        int countJump = 0;
        int heightJump = heightCM - 30;
        int failureJump = 0;
        boolean success = false;

        for (int i = 100; i <= 300; i++) {
            countJump++;
            int jump = Integer.parseInt(scanner.nextLine());
            if (jump > heightJump) {
                if (heightJump == heightCM) {
                    success = true;
                    break;
                }
                heightJump += 5;
                failureJump = 0;
            } else {
                failureJump++;
                if (failureJump == 3) {
                    break;
                }
            }
        }
        if (success) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", heightCM, countJump);
        }else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", heightJump, countJump);
        }
    }
}



