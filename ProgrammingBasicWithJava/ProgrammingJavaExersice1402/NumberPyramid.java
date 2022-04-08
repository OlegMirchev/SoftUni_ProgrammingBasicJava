package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex1402;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numb = 0;
        boolean isValid = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                numb++;
                System.out.print(numb + " ");
                if (numb >= n) {
                    isValid = true;
                    break;
                }
            }
           if (isValid) {
               break;
           }
           System.out.println();
        }
    }
}
