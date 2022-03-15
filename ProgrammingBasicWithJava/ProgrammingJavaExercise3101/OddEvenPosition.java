package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex3101;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double evenSum = 0.0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;
        double oddSum = 0.0;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            double numb = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += numb;
                if (numb > evenMax) {
                    evenMax = numb;
                }
                if (numb < evenMin) {
                    evenMin = numb;
                }
            } else {
                oddSum += numb;
                if (numb > oddMax) {
                    oddMax = numb;
                }
                if (numb < oddMin) {
                    oddMin = numb;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum == 0) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        }else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenSum == 0) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);

        }
    }
}
