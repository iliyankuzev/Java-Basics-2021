package JavaNovember2021.Exam18Cecember;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cake = scanner.nextLine();
        int numberCakes = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (cake) {
            case "Cake":
                if (day <= 15) {
                    price = numberCakes * 24 * 0.9;
                } else {
                    price = numberCakes * 28.70;
                }
                break;
            case "Souffle":
                if (day <= 15) {
                    price = numberCakes * 6.66 * 0.9;
                } else {
                    price = numberCakes * 9.80;
                }
                break;
            case "Baklava":
                if (day <= 15) {
                    price = numberCakes * 12.60 * 0.9;
                } else {
                    price = numberCakes * 16.98;
                }
                break;
        }
        if (day <= 22) {
            if (price >= 100 && price <= 200) {
                price *= 0.85;
            } else if (price > 200) {
                price *= 0.75;
            } else if (day <= 15) {
                price *= 0.9;
            }

        }
        System.out.printf("%.2f", price);
    }
}
