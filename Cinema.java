package JavaNovember2021.complexConditionalStatements.Exersices;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0;

        if ("Premiere".equals(projection)) {
            income = row * columns * 12.00;
        }else if ("Normal".equals(projection)){
            income = row * columns * 7.50;
        }else if ("Discount".equals(projection)){
            income = row * columns * 5.00;
        }
        System.out.printf("%.2f",income);
    }
}
