package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1402;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int prime = 0;
        int noPrime = 0;


        while (!command.equals("stop")) {
            boolean isValid = true;
            int numb = Integer.parseInt(command);
            if (numb < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < numb; i++) {
                if (numb % i == 0) {
                    isValid = false;
                    noPrime += numb;
                    break;
                }
            }
            if (isValid) {
                prime += numb;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d", prime, noPrime);
    }
}
