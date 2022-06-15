package JavaNovember2021.complexConditionalStatements.lab;

import java.util.Scanner;

public class SkiHollyday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();
        int nights = days - 1;
        double single = 18.00;
        double apartment = 25.00;
        double president = 35.00;
        double discount = 0;
        double result = 0;


        if (typeOfRoom.equals("room for one person") && (days <= 10 || (days > 10 && days <= 15) || days > 15)) {
            discount = nights * single;
            if (evaluation.equals("positive")) {
                result = (discount + discount * 0.25);
            } else if (evaluation.equals("negative")) {
                result=(discount + discount * 0.10);
            }
        }
        if (typeOfRoom.equals("apartment") && days <= 10){
            discount = nights * (apartment - (apartment * 0.30));
            if (evaluation.equals("positive")) {
                result = (discount + discount * 0.25);
            } else if (evaluation.equals("negative")) {
                result=(discount + discount * 0.10);
            }
        } else if (typeOfRoom.equals("apartment") && days > 10 && days <=15){
            discount = nights * (apartment - (apartment * 0.35));
            if (evaluation.equals("positive")) {
                result = (discount + discount * 0.25);
            } else if (evaluation.equals("negative")) {
                result=(discount + discount * 0.10);
            }
        } else if (typeOfRoom.equals("apartment") && days > 15) {
            discount = nights * (apartment - (apartment * 0.50));
            if (evaluation.equals("positive")) {
                result = (discount + discount * 0.25);
            } else if (evaluation.equals("negative")) {
                result=(discount + discount * 0.10);
            }
        } if (typeOfRoom.equals("president apartment") && days <= 10){
            discount = nights * (president - (president * 0.10));
            if (evaluation.equals("positive")) {
                result = (discount + discount * 0.25);
            } else if (evaluation.equals("negative")) {
                result=(discount + discount * 0.10);
            }
        } else if (typeOfRoom.equals("president apartment") && days > 10 && days <=15){
            discount = nights * (president - (president * 0.15));
            if (evaluation.equals("positive")) {
                result = (discount + discount * 0.25);
            } else if (evaluation.equals("negative")) {
                result=(discount + discount * 0.10);
            }
        } else if (typeOfRoom.equals("president apartment") && days > 15) {
            discount = nights * (president - (president * 0.20));
            if (evaluation.equals("positive")) {
                result = (discount + discount * 0.25);
            } else if (evaluation.equals("negative")) {
                result=(discount - discount * 0.10);
            }
        }
        System.out.printf("%.2f", result);
    }
}
