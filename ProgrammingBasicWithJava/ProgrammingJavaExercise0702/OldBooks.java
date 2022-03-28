package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex0702;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        String nextBook = scanner.nextLine();
        int count = 0;
        boolean isValid = false;

        while (!nextBook.equals("No More Books")) {
            if (nextBook.equals(book)) {
                isValid = true;
                break;
            }
            count++;


            nextBook = scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("You checked %d books and found it.", count);
        }else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", count);
        }
    }
}
