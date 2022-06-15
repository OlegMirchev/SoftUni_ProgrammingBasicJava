package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityEggs = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int soldEggs = 0;
        boolean isValid = false;

        while (!command.equals("Close")) {
            int numbEggs = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case "Buy":
                    if (quantityEggs < numbEggs) {
                        isValid = true;
                        break;
                    }
                    quantityEggs -= numbEggs;
                    soldEggs += numbEggs;
                    break;
                case "Fill":
                    quantityEggs += numbEggs;
                    break;
            }
            if (isValid) {
                break;
            }
            command = scanner.nextLine();
        }
        if (isValid) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", quantityEggs);
        }else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }
    }
}
