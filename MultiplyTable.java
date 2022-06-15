package JavaNovember2021.Exam11December2021;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int x = num / 100;
        int deseti = num / 10;
        int y = deseti - x * 10;
        int z = num - (x * 100 + y * 10);
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= y; j++) {
                for (int k = 1; k <= x; k++) {
                    int total = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, total);
                }
            }
        }
    }
}



