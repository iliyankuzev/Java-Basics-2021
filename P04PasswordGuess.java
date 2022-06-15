package JavaNovember2021.ConditionalStatements.lab;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "s3cr3t!P@ssw0rd";
        String inputPass = scanner.nextLine();

        if (password.equals(inputPass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }


    }
}