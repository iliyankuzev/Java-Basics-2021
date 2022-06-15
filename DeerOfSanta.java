package JavaNovember2021.Exam11December2021;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());
        int deerFood = Integer.parseInt(scanner.nextLine());
        double foodForFirstDeerDay = Double.parseDouble(scanner.nextLine());
        double foodForSecondDeerDay = Double.parseDouble(scanner.nextLine());
        double foodForThirdDeerDay = Double.parseDouble(scanner.nextLine());

        double firstDeer = daysOff * foodForFirstDeerDay;
        double secondDeer = daysOff * foodForSecondDeerDay;
        double thirdDeer = daysOff * foodForThirdDeerDay;

        double totalFood = firstDeer + secondDeer + thirdDeer;

        if (totalFood <= deerFood) {
            double result = Math.floor(deerFood - totalFood);
            System.out.printf("%.0f kilos of food left.", result);

        } else {
            double result1 = Math.ceil(totalFood - deerFood);
            System.out.printf("%.0f more kilos of food are needed.", result1);
        }


    }
}
