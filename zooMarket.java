package JavaNovember2021.FirstStepInCoding.Lab;

import java.util.Scanner;

public class zooMarket {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int myDogs = Integer.parseInt(scanner.nextLine());
            int otherDogs = Integer.parseInt(scanner.nextLine());

            double myDogsPrice = myDogs * 2.50;
            double otherDogsPrice = otherDogs * 4.0;

            System.out.println(myDogsPrice + otherDogsPrice + " lv.");

        }
}
