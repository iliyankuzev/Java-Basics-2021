package JavaNovember2021.FirstStepInCoding.Exercise;

import java.util.Scanner;

public class p3DepositCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int termOfDeposit = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double sum = deposit + termOfDeposit * ((deposit * interestRate / 100) / 12);

        System.out.println(sum);
    }
}

