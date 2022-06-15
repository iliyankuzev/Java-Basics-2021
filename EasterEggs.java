package JavaNovember2021.Exam11December2021;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberEggs = Integer.parseInt(scanner.nextLine());

        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;
        int maxEggs = 0;
        String maxEggsColor = "";

        for (int i = 1; i <= numberEggs; i++) {
            String eggsColor = scanner.nextLine();
            switch (eggsColor) {
                case "red":
                    redCount++;
                    if (maxEggs < redCount) {
                        maxEggs = redCount;
                        maxEggsColor = "red";
                    }
                    break;
                case "orange":
                    orangeCount++;
                    if (maxEggs < orangeCount) {
                        maxEggs = orangeCount;
                        maxEggsColor = "orange";
                    }
                    break;
                case "blue":
                    blueCount++;
                    if (maxEggs < blueCount) {
                        maxEggs = blueCount;
                        maxEggsColor = "blue";
                    }
                    break;
                case "green":
                    greenCount++;
                    if (maxEggs < greenCount) {
                        maxEggs = greenCount;
                        maxEggsColor = "green";
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", redCount);
        System.out.printf("Orange eggs: %d%n", orangeCount);
        System.out.printf("Blue eggs: %d%n", blueCount);
        System.out.printf("Green eggs: %d%n", greenCount);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxEggsColor);
    }
}
