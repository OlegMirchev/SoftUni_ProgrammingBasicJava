package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0901;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kvMetres = Double.parseDouble(scanner.nextLine());

        double courtyard = kvMetres * 7.61;
        double discount = courtyard * 0.18;


        double totalSum = courtyard - discount;

        System.out.printf("The final price is: %f lv.", totalSum);
        System.out.printf("The discount is: %f lv.", discount);

    }
}
