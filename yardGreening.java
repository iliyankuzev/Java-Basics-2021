package JavaNovember2021.FirstStepInCoding.Lab;

import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yardSquare = Integer.parseInt(scanner.nextLine());
        double greeningPrice = yardSquare * 7.61;
        double discount = greeningPrice * 0.18;
        System.out.println("The final price is: " +(greeningPrice-discount) + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
