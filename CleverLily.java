package JavaNovember2021.ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liliAges = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());

        int toyPrice = Integer.parseInt(scanner.nextLine());

        int moneyPresent = 0;
        int toyCount = 0;

        for (int i = 1; i <= liliAges; i++) {
            if (i % 2 == 0) {
                moneyPresent += i*5 - 1;

            } else {
                toyCount++;
            }
        }
        int toySum = toyCount * toyPrice;
        double totalSum = moneyPresent + toySum;

        if (laundryPrice <= totalSum) {
            System.out.printf("Yes! %.2f", totalSum - laundryPrice);
        } else {
            System.out.printf("No! %.2f", laundryPrice - totalSum);
        }
    }
}
