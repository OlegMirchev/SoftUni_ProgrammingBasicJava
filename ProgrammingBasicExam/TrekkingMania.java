package ProgrammingBasic2021.TasksFromExercise.PBExem;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbGroup = Integer.parseInt(scanner.nextLine());
        double allPeople = 0;
        double counterMusala = 0.0;
        double counterMontBlanc = 0.0;
        double counterKilimanjaro = 0.0;
        double counterK2 = 0.0;
        double counterEverest = 0.0;
        double peopleMusala = 0.0;
        double peopleMontBlanc = 0.0;
        double peopleKilimanjaro = 0.0;
        double peopleK2 = 0.0;
        double peopleEverest = 0.0;

        for (int i = 1; i <= numbGroup; i++) {
            int numbPeople = Integer.parseInt(scanner.nextLine());
            allPeople += numbPeople;

            if (numbPeople <= 5) {
                counterMusala += numbPeople;
            } else if (numbPeople <= 12) {
                counterMontBlanc += numbPeople;
            } else if (numbPeople <= 25) {
                counterKilimanjaro += numbPeople;
            } else if (numbPeople <= 40) {
                counterK2 += numbPeople;
            } else {
                counterEverest += numbPeople;
            }


        }
        peopleMusala = (counterMusala / allPeople) * 100;
        peopleMontBlanc = (counterMontBlanc / allPeople) * 100;
        peopleKilimanjaro = (counterKilimanjaro / allPeople) * 100;
        peopleK2 = (counterK2 / allPeople) * 100;
        peopleEverest = (counterEverest / allPeople) * 100;
        System.out.printf("%.2f%%%n", peopleMusala);
        System.out.printf("%.2f%%%n", peopleMontBlanc);
        System.out.printf("%.2f%%%n", peopleKilimanjaro);
        System.out.printf("%.2f%%%n", peopleK2);
        System.out.printf("%.2f%%", peopleEverest);

    }
}
