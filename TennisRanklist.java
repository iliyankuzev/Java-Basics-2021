package JavaNovember2021.ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tournament = Double.parseDouble(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int currentPoints = 0;

        double winTournamentCount = 0;


        for (int i = 1; i <= tournament; i++) {

            String ranking = scanner.nextLine();

            if ("W".equals(ranking)) {
                currentPoints += 2000;
                winTournamentCount++;
            } else if ("F".equals(ranking)) {
                currentPoints += 1200;
            } else if ("SF".equals(ranking)) {
                currentPoints += 720;
            }
        }
        int totalPoints = startingPoints + currentPoints;
        double equalPoints = currentPoints / tournament;
        double persentOfWins = winTournamentCount * (100 / tournament);
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(equalPoints));
        System.out.printf("%.2f%%",persentOfWins);
    }
}
