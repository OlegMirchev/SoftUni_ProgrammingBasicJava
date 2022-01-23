package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB1601;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        switch (figure) {
            case "square":
                double a = Double.parseDouble(scanner.nextLine());
                double areaSquare = a * a;
                System.out.printf("%.3f", areaSquare);
                break;
            case "rectangle":
                double x = Double.parseDouble(scanner.nextLine());
                double y = Double.parseDouble(scanner.nextLine());
                double areaRectangle = x * y;
                System.out.printf("%.3f", areaRectangle);
                break;
            case "circle":
                double r = Double.parseDouble(scanner.nextLine());
                double areaCircle = Math.PI * Math.pow(r, 2);
                System.out.printf("%.3f", areaCircle);
                break;
            case "triangle":
                double c = Double.parseDouble(scanner.nextLine());
                double hc = Double.parseDouble(scanner.nextLine());
                double areaTriangle = (c * hc) / 2;
                System.out.printf("%.3f", areaTriangle);
                break;
        }


    }
}
