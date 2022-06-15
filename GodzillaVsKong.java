package JavaNovember2021.ConditionalStatements.Exersices;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double actorClothing = Double.parseDouble(scanner.nextLine());

        double decor = filmBudget * 0.1;

        double clothes = actors * actorClothing;
        if (actors > 150) {
            clothes = clothes - clothes * 0.1;
        }
        double totalsum = decor + clothes;

        if (totalsum > filmBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", (totalsum - filmBudget));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", (filmBudget - totalsum));
        }

    }
}
