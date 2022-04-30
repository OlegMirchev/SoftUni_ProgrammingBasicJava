package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        boolean n = false;
        boolean o = false;
        boolean c = false;
        String word = "";

        while (!command.equals("End")) {
            char symbols = command.charAt(0);
            boolean settSymbol = false;
            if ((symbols >= 'a' && symbols <= 'z') || (symbols >= 'A' && symbols <= 'Z')) {
                switch (symbols) {
                    case 'n':
                        settSymbol = n;
                        n = true;
                        break;
                    case 'o':
                        settSymbol = o;
                        o = true;
                        break;
                    case 'c':
                        settSymbol = c;
                        c = true;
                        break;
                    default:
                        settSymbol = true;
                        break;
                }
            }
            if (settSymbol) {
                word += symbols;
            }
            if (n && o && c) {
                System.out.print(word + " ");
                word = "";
                n = false;
                o = false;
                c = false;
            }
            command = scanner.nextLine();
        }
    }
}
