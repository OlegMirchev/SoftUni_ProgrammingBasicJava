package ProgrammingBasic2021.TasksFromExercise.PBMoreExersice.PBMoreExercieseConditionalStatements;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbMagnolias = Integer.parseInt(scanner.nextLine());
        int numbHyacinths = Integer.parseInt(scanner.nextLine());
        int numbRose = Integer.parseInt(scanner.nextLine());
        int numbCactus = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double sum = numbMagnolias * 3.25 + numbHyacinths * 4 + numbRose * 3.5 + numbCactus * 8;
        sum *= 0.95;

        if (sum >= priceGift) {
            double left = sum - priceGift;
            System.out.printf("She is left with %.0f leva.", Math.floor(left));
        }else {
            double borrow = priceGift - sum;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(borrow));
        }
    }
}
