package JavaNovember2021.FirstStepInCoding.Exercise;

import java.util.Scanner;

public class p7FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberryPrice - strawberryPrice * 0.5;
        double orangesPrice = raspberriesPrice - raspberriesPrice * 0.4;
        double bananasPrice = raspberriesPrice - raspberriesPrice * 0.8;

        double totalraspberriesPrice = raspberriesKg * raspberriesPrice;
        double totalOrangesPrice = orangesKg * orangesPrice;
        double totalBananaPrice = bananasKg * bananasPrice;
        double totalStrawberryPrice = strawberriesKg * strawberryPrice;

        double totalMoney = totalStrawberryPrice + totalraspberriesPrice + totalOrangesPrice + totalBananaPrice;
        System.out.printf("%.2f", totalMoney);


    }
}
