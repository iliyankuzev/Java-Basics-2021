package JavaNovember2021.Exam18Cecember;

import java.util.Scanner;

public class RoomPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintBoxes = Integer.parseInt(scanner.nextLine());
        int wallPaper = Integer.parseInt(scanner.nextLine());
        double gloves = Double.parseDouble(scanner.nextLine());
        double brush = Double.parseDouble(scanner.nextLine());

        double totalCostPaint = 21.50 * paintBoxes;
        double totalCostWallPaper = 5.20 * wallPaper;
        double neededGloves = Math.ceil(wallPaper * 0.35);
        double neededBrush = Math.floor(paintBoxes * 0.48);
        double totalGlovesPrice = neededGloves * gloves;
        double totalBrushPrice = neededBrush * brush;

        double totalSum = totalCostPaint + totalCostWallPaper+ totalGlovesPrice + totalBrushPrice;
        double delivery = totalSum / 15;

        System.out.printf("This delivery will cost %.2f lv.",delivery);


    }
}

