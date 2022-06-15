package JavaNovember2021.complexConditionalStatements.Exersices;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String outFit = "";
        String shoes = "";

        if (dayTime.equals("Morning")) {
            if (degrees >= 10 && degrees <= 18) {
                outFit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrees > 18 && degrees <= 24) {
                outFit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 25) {
                outFit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (dayTime.equals("Afternoon")) {
            if (degrees >= 10 && degrees <= 18) {
                outFit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees > 18 && degrees <= 24) {
                outFit = "T-Shirt";
                shoes = "Sandals";
            } else if (degrees >= 25) {
                outFit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if (dayTime.equals("Evening")) {
            if (degrees >= 10 && degrees <= 18) {
                outFit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees > 18 && degrees <= 24) {
                outFit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 25) {
                outFit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees , outFit , shoes);
    }
}