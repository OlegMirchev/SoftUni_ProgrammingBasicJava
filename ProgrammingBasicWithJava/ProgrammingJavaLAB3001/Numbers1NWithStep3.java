package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB3001;

import java.util.Scanner;

public class Numbers1NWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        int numb = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numb ; i = i + 3) {
            System.out.println(i);
            
        }
    }
}
