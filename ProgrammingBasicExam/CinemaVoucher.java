package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucher = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int sumSymbol1and2 = 0;
        int sumOther = 0;
        int buyTickets = 0;
        int buyOther = 0;

        while (!command.equals("End")) {
            String buyProduct = command;
            if (buyProduct.length() > 8) {
                char symbol1 = buyProduct.charAt(0);
                char symbol2 = buyProduct.charAt(1);
                sumSymbol1and2 = symbol1 + symbol2;
                voucher -= sumSymbol1and2;
                if (voucher < 0) {
                    break;
                }
                buyTickets++;
            } else {
                sumOther = buyProduct.charAt(0);
                voucher -= sumOther;
                if (voucher < 0) {
                    break;
                }
                buyOther++;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%d%n", buyTickets);
        System.out.printf("%d", buyOther);
    }
}
