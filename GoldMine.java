package JavaNovember2021.Exam18Cecember;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int location = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < location; i++) {

            double expectedGoldPerDay = Double.parseDouble(scanner.nextLine());
            int diggingDays = Integer.parseInt(scanner.nextLine());
            double totalGold = 0.0;


            for (int j = 1; j <= diggingDays; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                totalGold += goldPerDay;


            }

            double averageGold = totalGold / diggingDays;
            if (averageGold >= expectedGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGold);
            } else {
                System.out.printf("You need %.2f gold.", expectedGoldPerDay - averageGold);
            }
        }
    }
}
