package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB0901;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int oneProjects = 3;

        int totalHours = projects * oneProjects;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalHours, projects);


    }
}
