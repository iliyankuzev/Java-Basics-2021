package JavaNovember2021.complexConditionalStatements.Exersices;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherMan = Integer.parseInt(scanner.nextLine());
        double boatRent = 0;


        switch (season) {
            case "Spring":
                boatRent = 3000;
                if (fisherMan <= 6) {
                    boatRent *= 0.90;

                } else if (fisherMan <= 11) {
                    boatRent *= 0.85;

                } else {
                    boatRent *= 0.75;

                }
                break;
            case "Summer":
            case "Autumn":
                boatRent = 4200;
                if (fisherMan <= 6) {
                    boatRent *= 0.90;

                } else if (fisherMan <= 11) {
                    boatRent *= 0.85;

                } else {
                    boatRent *= 0.75;

                }
                break;
            case "Winter":
                boatRent = 2600;
                if (fisherMan <= 6) {
                    boatRent *= 0.90;

                } else if (fisherMan <= 11) {
                    boatRent *= 0.85;

                } else {
                    boatRent *= 0.75;

                }
                break;
        }
        if (fisherMan % 2 == 0 && !"Autumn".equals(season)) {
            boatRent *= 0.95;
        }
        if (budget >= boatRent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boatRent);
        } else if (budget < boatRent) {
            System.out.printf("Not enough money! You need %.2f leva.", boatRent - budget);
        }

    }
}

