package JavaNovember2021.ConditionalStatements.lab;

import java.util.Scanner;

public class P01ExellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Sorry, try next time!");

        }
    }
}
