package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int eggsSecondPlayer = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();

        while (!winner.equals("End of battle")) {
            switch (winner) {
                case "one":
                    eggsSecondPlayer -= 1;
                    break;
                case "two":
                    eggsFirstPlayer -= 1;
                    break;
            }
            if (eggsFirstPlayer == 0 || eggsSecondPlayer == 0) {
                break;
            }
            winner = scanner.nextLine();
        }
        if (eggsFirstPlayer == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecondPlayer);
        }else if (eggsSecondPlayer == 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsFirstPlayer);
        }else {
            System.out.printf("Player one has %d eggs left.%n", eggsFirstPlayer);
            System.out.printf("Player two has %d eggs left.%n", eggsSecondPlayer);
        }
    }
}
