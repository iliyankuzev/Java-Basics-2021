package JavaNovember2021.FirstStepInCoding.Exercise;

import java.util.Scanner;

public class p6CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int pastryShefs = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakesPerDay = cakes * 45.0;
        double wafflesPerDay = waffles * 5.80;
        double pancakesPerDay = pancakes * 3.20;

        double sumForDay = (cakesPerDay + wafflesPerDay + pancakesPerDay) * pastryShefs;
        double campaignSum = sumForDay * days * 7/8;
        //double costs = campaignSum - campaignSum / 8.0;

        System.out.printf("%.2f", campaignSum);
    }
}
