package JavaNovember2021.Exam11December2021;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double sum = m;

        for (int i = 0; i <= n; i++) {

            int k = Integer.parseInt(scanner.nextLine());
            m *= 1 + k / 100.0;
            sum += m;
        }
        if (sum < 1000) {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %d more kilometers", Math.floor(1000 - sum));
        } else {
            System.out.printf("You've done a great job running %d more kilometers!", Math.floor(1000 - sum));
        }

    }
}
