package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinesMoney = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double numbBit = bitcoin * 1168;
        double numbChinesMoney = chinesMoney * 0.15;
        double dollar = numbChinesMoney * 1.76;
        double sum = (numbBit + dollar) / 1.95;
        double fee = sum * (commission / 100);
        double euros = sum - fee;

        System.out.printf("%.2f", euros);

    }
}
