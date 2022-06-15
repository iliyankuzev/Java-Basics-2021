package JavaNovember2021.ConditionalStatements.Exersices;

import java.util.Scanner;

public class P04DimensionConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String unitIn = scanner.nextLine();
        String unitOut = scanner.nextLine();

        if (unitIn.equals("mm")) {
            if (unitOut.equals("m")) {
                number = number / 1000;
            } else {
                number = number / 100;
            }
        } else if (unitIn.equals("cm")) {
            if (unitOut.equals("m")) {
                number = number / 100;
            } else {
                number = number * 10;
            }
        } else if (unitIn.equals("m")) {
            if (unitOut.equals("cm")) {
                number = number * 100;
            } else {
                number = number * 1000;
            }
        }
        System.out.printf("%.3f", number);
    }
}
