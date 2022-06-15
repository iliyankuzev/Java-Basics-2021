package JavaNovember2021.Exam18Cecember;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCats = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        int littleCats = 0;
        int mediumCats = 0;
        int bigCats = 0;
        double totalFood = 0;
        int catCount = 0;

        for (int i = 1; i <= numberCats; i++) {

            if (food >= 300 && food < 400) {
                bigCats++;
                totalFood += food;

            } else if (food >= 200 && food < 300) {
                mediumCats++;
                totalFood += food;

            } else if (food >= 100 && food < 200) {
                littleCats++;
                totalFood += food;

            }
            catCount++;
            if (catCount == numberCats) {
                break;
            }
            food = Double.parseDouble(scanner.nextLine());
        }
        double foodPrice = totalFood * 12.45 / 1000;

        System.out.printf("Group 1: %d cats.%n", littleCats);
        System.out.printf("Group 2: %d cats.%n", mediumCats);
        System.out.printf("Group 3: %d cats.%n", bigCats);
        System.out.printf("Price for food per day: %.2f lv.%n", foodPrice);
    }
}