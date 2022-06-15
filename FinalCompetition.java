package JavaNovember2021.Exam11December2021;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();
        double charity = 0;
        double moneyPerDancer = 0;
        double money = 0;
        double leftMoney = 0;

        if ("Bulgaria".equals(place)) {

            if ("summer".equals(season)) {
                money = 1.0 * points * dancers * 0.95;
            } else if ("winter".equals(season)) {
                money = 1.0 * points * dancers * 0.92;
            }
            charity = money * 0.75;
            leftMoney = money - charity;
            moneyPerDancer = 1.0 * leftMoney / dancers;

        } else if ("Abroad".equals(place)) {
            money = 1.0 * dancers * points + (points * 0.5);
            if ("summer".equals(season)) {
                money *= 0.9;
            } else if ("winter".equals(season)) {
                money *= 0.85;
            }
            charity = money * 0.75;
            leftMoney = money - charity;
            moneyPerDancer = 1.0 * leftMoney / dancers;
        }
        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);
    }
}
