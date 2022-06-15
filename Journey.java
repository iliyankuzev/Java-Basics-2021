package JavaNovember2021.complexConditionalStatements.Exersices;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double moneyForJourney = 0;
        String destination = "";
        String typeHollyday = "";

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    budget *= 0.30;
                    destination = "Bulgaria";
                    typeHollyday = "Camp";
                } else if (budget <= 1000) {
                    budget *= 0.40;
                    destination = "Balkans";
                    typeHollyday = "Camp";
                } else if (budget > 1000) {
                    budget *= 0.90;
                    destination = "Europe";
                    typeHollyday = "Hotel";
                }
                break;
            case "winter":
                if (budget <= 100) {
                    budget *= 0.70;
                    destination = "Bulgaria";
                    typeHollyday = "Hotel";
                } else if (budget <= 1000) {
                    budget *= 0.80;
                    destination = "Balkans";
                    typeHollyday = "Hotel";
                } else if (budget > 1000) {
                    budget *= 0.90;
                    destination = "Europe";
                    typeHollyday = "Hotel";
                }
                break;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf(typeHollyday + " - " + "%.2f",budget);
    }
}
