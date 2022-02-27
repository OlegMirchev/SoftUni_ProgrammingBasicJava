package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021LAB3001;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();


        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            System.out.println(letter);
            
        }
    }
}
