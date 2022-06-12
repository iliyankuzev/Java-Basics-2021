package JavaNovember2021.ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupOfClimbers = Integer.parseInt(scanner.nextLine());

        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;


        for (int i = 0; i < groupOfClimbers; i++) {
            int numberOfClimbers = Integer.parseInt(scanner.nextLine());

            if (numberOfClimbers <= 5) {
                group1 = group1 + numberOfClimbers;
            } else if (numberOfClimbers <= 12) {
                group2 = group2 + numberOfClimbers;
            } else if (numberOfClimbers <= 25) {
                group3 = group3 + numberOfClimbers;
            } else if (numberOfClimbers <= 40) {
                group4 = group4 + numberOfClimbers;
            } else {
                group5 = group5 + numberOfClimbers;
            }
        }
        int totalCilmbers = group1 + group2 + group3 + group4 + group5;

        System.out.printf("%.2f%%%n", group1 * 1.0 / totalCilmbers * 100);
        System.out.printf("%.2f%%%n", group2 * 1.0 / totalCilmbers * 100);
        System.out.printf("%.2f%%%n", group3 * 1.0 / totalCilmbers * 100);
        System.out.printf("%.2f%%%n", group4 * 1.0 / totalCilmbers * 100);
        System.out.printf("%.2f%%%n", group5 * 1.0 / totalCilmbers * 100);
    }
}
