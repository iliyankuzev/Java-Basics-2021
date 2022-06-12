package JavaNovember2021.ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;

        for (int i = 1; i <= judges; i++) {

            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            double currentJudgePoint = (judgeName.length() * judgePoints) / 2;

           if (totalPoints < 1250.5) {
                totalPoints = totalPoints + currentJudgePoint;
            }

        }
        if ((totalPoints) < 1250.50) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, (1250.5 - totalPoints));
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        }
    }
}
