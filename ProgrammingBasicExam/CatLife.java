package ProgrammingBasic2021.TasksFromExercise.pExam;

import java.util.Scanner;

public class CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cat = scanner.nextLine();
        String genderCat = scanner.nextLine();
        double catYears = 0.0;
        boolean isValid = false;

        switch (cat) {
            case "British Shorthair":
                if (genderCat.equals("m")) {
                    catYears = 13;
                } else if (genderCat.equals("f")) {
                    catYears = 14;
                }
                break;
            case "Siamese":
                if (genderCat.equals("m")) {
                    catYears = 15;
                } else if (genderCat.equals("f")) {
                    catYears = 16;
                    break;
                }
            case "Persian":
                if (genderCat.equals("m")) {
                    catYears = 14;
                } else if (genderCat.equals("f")) {
                    catYears = 15;
                }
                break;
            case "Ragdoll":
                if (genderCat.equals("m")) {
                    catYears = 16;
                } else if (genderCat.equals("f")) {
                    catYears = 17;
                }
                break;
            case "American Shorthair":
                if (genderCat.equals("m")) {
                    catYears = 12;
                } else if (genderCat.equals("f")) {
                    catYears = 13;
                }
                break;
            case "Siberian":
                if (genderCat.equals("m")) {
                    catYears = 11;
                } else if (genderCat.equals("f")) {
                    catYears = 12;
                }
                break;
            default:
                System.out.printf("%s is invalid cat!", cat);
                isValid = true;
                break;
        }
        if (!isValid) {
            double catMonth = Math.floor(catYears * 12 / 6);
            System.out.printf("%.0f cat months", catMonth);

        }
    }

}



