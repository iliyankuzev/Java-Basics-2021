package JavaNovember2021.ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (maxNum <= number) {
                maxNum = number;
            }
        }
        int sumWithOutMaxNum = sum - maxNum;
        if (maxNum == sumWithOutMaxNum) {
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNum-sumWithOutMaxNum));
        }
    }
}
