package JavaNovember2021.ConditionalStatements.lab;

import java.util.Scanner;

public class P06ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sumOfToys = puzzles * 2.60 +
                           dolls * 3 +
                           teddyBears * 4.10 +
                           minions * 8.20 +
                           trucks * 2;
        int numOfToys = puzzles + dolls + teddyBears + minions + trucks;

        if (numOfToys >= 50) {
            sumOfToys = sumOfToys - (sumOfToys * 0.25);

        }
        sumOfToys = sumOfToys * 0.9;

        double profit = Math.abs(sumOfToys - excursion);

        if (sumOfToys >= excursion) {
            System.out.printf("Yes! %.2f lv left.", profit);
        } else {
            System.out.printf("Not enough money! %.2f lv needed." , profit);
        }
    }
}

