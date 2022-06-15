package JavaNovember2021.complexConditionalStatements.Exersices;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int countFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double roses = 5;
        double dahlias = 3.80;
        double tulips = 2.80;
        double narcissus = 3.00;
        double gladiolus = 2.50;
        double discount = 0;
        double sum = 0;

        switch (typeFlower) {
            case "Roses":
                if (countFlower > 80) {
                    discount = countFlower * roses * 0.90;
                } else {
                    discount = countFlower * roses;
                }
                break;
            case "Dahlias":
                if (countFlower > 90) {
                    discount = countFlower * dahlias * 0.85;
                } else {
                    discount = countFlower * dahlias;
                }
                break;
            case "Tulips":
                if (countFlower > 80) {
                    discount = countFlower * tulips * 0.85;
                } else {
                    discount = countFlower * tulips;
                }
                break;
            case "Narcissus":
                if (countFlower < 120) {
                    discount = countFlower * narcissus * 1.15;
                } else {
                    discount = countFlower * narcissus;
                }
                break;
            case "Gladiolus":
                if (countFlower < 80) {
                    discount = countFlower * gladiolus * 1.20;
                } else {
                    discount = countFlower * gladiolus;
                }
                break;
        }
        if (budget >= discount) {
            sum = budget - discount;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlower, typeFlower, sum);
        } else if (budget <= discount) {
            sum = discount - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", sum);

        }
    }
}
