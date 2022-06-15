package JavaNovember2021.Exam11December2021;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int startHeight = 5364;
        int target = 8848;
        int currentHeight = 0;
        int count = 1;

        while (!input.equals("END")) {

            int height = Integer.parseInt(scanner.nextLine());

            currentHeight += height;

            if (input.equals("Yes")) {
                count++;
            }

            if (currentHeight + startHeight >= target || count == 5) {
                break;
            }
            input = scanner.nextLine();
        }
        if (startHeight + currentHeight < target) {
            System.out.println("Failed!");
            System.out.printf("%d", startHeight + currentHeight);
        } else {
            System.out.printf("Goal reached for %d days!", count);
        }
    }
}

