package JavaNovember2021.ConditionalStatements.Exersices;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());

        double totalTime = (distance * timeForMeter) + Math.floor(distance  / 15) * 12.5;
        if (recordInSec <= totalTime) {
            System.out.printf("No, he failed! He was %.02f seconds slower.", totalTime - recordInSec);

        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.02f seconds.", totalTime);
        }

    }
}
