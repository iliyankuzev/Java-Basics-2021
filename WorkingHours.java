package JavaNovember2021.complexConditionalStatements.lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (time >= 10 && time <= 18) {
            switch (day) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" -> System.out.println("open");
                default -> System.out.println("closed");
            }
        } else System.out.println("closed");
    }
}