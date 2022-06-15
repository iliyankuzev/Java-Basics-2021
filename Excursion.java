package JavaNovember2021.Exam11December2021;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInGroup = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCards = Integer.parseInt(scanner.nextLine());
        int museumTickets = Integer.parseInt(scanner.nextLine());

        int nightsForOnePerson = nights * 20;
        double totalCards = transportCards * 1.60;
        int totalTickets = museumTickets * 6;

        double totalSumForOnePerson = nightsForOnePerson+totalCards+totalTickets;
        double totalGroupSum = totalSumForOnePerson * peopleInGroup;
        double discount = totalGroupSum + (totalGroupSum * 0.25);

        System.out.printf("%.2f",discount);

    }
}
