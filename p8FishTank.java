package JavaNovember2021.FirstStepInCoding.Exercise;

import java.util.Scanner;

public class p8FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int tankVolume = length * width * height;
        double tankLitres = tankVolume * 0.001;
        double air = percentage * 0.01;
        double realLitres = tankLitres * (1 - air);

        System.out.printf("%.2f", realLitres);
    }
}
