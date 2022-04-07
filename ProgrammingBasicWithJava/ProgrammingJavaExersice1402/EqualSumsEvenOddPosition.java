package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1402;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number1; i <= number2; i++) {
            int sumEven = 0;
            int sumOdd = 0;
            int countNumb = i;
            for (int position = 6; position >= 1; position--) {
                int diff = countNumb % 10;
                countNumb /= 10;
                if (position % 2 ==0) {
                    sumEven += diff;
                }else {
                    sumOdd += diff;
                }
            }
            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
