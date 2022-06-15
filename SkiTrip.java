package JavaNovember2021.complexConditionalStatements.lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String rating = scanner.nextLine();
        double room = 18.00;
        double apartment = 25.00;
        double presidentapartment = 35.00;
        int nights = days - 1;
        double finalprice = 0;
        if (type.equals("room for one person")) {
            finalprice = nights * room;
        }
        if (type.equals("apartment")) {
            finalprice = nights * apartment;
        }
        if (type.equals("president apartment")) {
            finalprice = nights * presidentapartment;
        }
        double discount = 0;
        if (type.equals("room for one person")) {
            discount = 0;
        } else if (type.equals("apartment") && days < 10) {
            discount = finalprice * 0.3;
        } else if (type.equals("apartment") && days >= 10 && days <= 15) { //тук е &&, а не ||
            discount = finalprice * 0.35;
        } else if (type.equals("apartment") && days > 15) {
            discount = finalprice * 0.5;
        } else if (type.equals("president apartment") && days < 10) {
            discount = finalprice * 0.1;
        } else if (type.equals("president apartment") && days >= 10 && days <= 15) {
            discount = finalprice * 0.15;
        } else if (type.equals("president apartment") && days > 15) {
            discount = finalprice * 0.2;
        }
        double finalpricedisc = finalprice - discount;
        double positive = finalpricedisc+ (finalpricedisc*0.25);
        double negative = finalpricedisc - (finalpricedisc*0.1);
        if (rating.equals("positive")) {
            System.out.printf("%.2f", positive);
        } else if (rating.equals("negative")) {
            System.out.printf("%.2f", negative);
        }
    }
}

