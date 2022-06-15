package JavaNovember2021.FirstStepInCoding.Exercise;

import java.util.Scanner;

public class p05HappyBirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        double cakePrice = hallRent * 0.2;
        double drinksPrice = cakePrice * 0.55;
        double animator = hallRent / 3.0;
        double sumForParty = hallRent + cakePrice + drinksPrice + animator;

        System.out.println(cakePrice);
        System.out.println(drinksPrice);
        System.out.println(animator);
        System.out.println(sumForParty);

    }
}
