package JavaNovember2021.complexConditionalStatements.lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double amount = 0;

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                amount = 0.5;
            } else if (product.equals("water")) {
                amount = 0.8;
            } else if (product.equals("beer")) {
                amount = 1.2;
            } else if (product.equals("sweets")) {
                amount = 1.45;
            } else if (product.equals("peanuts")) {
                amount = 1.6;
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                amount = 0.4;
            } else if (product.equals("water")) {
                amount = 0.7;
            } else if (product.equals("beer")) {
                amount = 1.15;
            } else if (product.equals("sweets")) {
                amount = 1.3;
            } else if (product.equals("peanuts")) {
                amount = 1.5;
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                amount = 0.45;
            } else if (product.equals("water")) {
                amount = 0.7;
            } else if (product.equals("beer")) {
                amount = 1.1;
            } else if (product.equals("sweets")) {
                amount = 1.35;
            } else if (product.equals("peanuts")) {
                amount = 1.55;
            }
        }
        System.out.println(quantity * amount);
    }
}
