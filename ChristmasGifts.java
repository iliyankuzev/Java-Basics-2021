package JavaNovember2021.Exam18Cecember;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int toyPrice = 5;
        int pullover = 15;
        int under16Count = 0;
        int over16Count = 0;
        while (!text.equals("Christmas")) {

            int age = Integer.parseInt(text);

            if (age <= 16) {
                under16Count++;
            } else {
                over16Count++;
            }
            text = scanner.nextLine();
        }
        int totalToyPrice = under16Count * toyPrice;
        int totalPulloverPrice = over16Count * pullover;

        System.out.printf("Number of adults: %d%n",over16Count);
        System.out.printf("Number of kids: %d%n",under16Count);
        System.out.printf("Money for toys: %d%n",totalToyPrice);
        System.out.printf("Money for sweaters: %d%n",totalPulloverPrice);

    }
}
