package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        String nameWord = "";


        while (!word.equals("End of words")) {
            int sum = 0;
            int letter = word.length();
            int lengthWord = 0;

            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);
                sum += symbol;
            }
            if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' ||
                    word.charAt(0) == 'u' || word.charAt(0) == 'y' || word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' ||
                    word.charAt(0) == 'O' || word.charAt(0) == 'U' || word.charAt(0) == 'Y') {
                lengthWord = sum * letter;

            } else {
                lengthWord = sum / letter;
            }
            if (lengthWord > max) {
                max = lengthWord;
                nameWord = word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", nameWord, max);
    }
}
