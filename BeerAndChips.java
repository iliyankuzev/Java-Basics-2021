package JavaNovember2021.Exam18Cecember;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());

        double beerPrice = beers * 1.20;
        double chipsPrice = beerPrice * 0.45;
        double totalChipsPrice = Math.ceil(chips * chipsPrice);
        double totalPrice = beerPrice + totalChipsPrice;
        double diff;
        if (budget >= totalPrice) {
            diff = budget - totalPrice;
            System.out.printf("%s bought a snack and has %.2f leva left.", name, diff);
        } else if (totalPrice > budget){
            diff = totalPrice - budget;
            System.out.printf("%s needs %.2f more leva!", name, diff);
        }


    }
}
