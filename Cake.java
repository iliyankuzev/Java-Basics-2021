package JavaNovember2021.WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());

        int cakePieces = width * lenght;
        String input = scanner.nextLine();
        int pieces = 0;
        while (!"STOP".equals(input)) {
            int serving = Integer.parseInt(input);

            pieces += serving;

            if (pieces > cakePieces) {
                System.out.printf("No more cake left! You need %d pieces more.", (pieces - cakePieces));
                break;
            }

            input = scanner.nextLine();
        }
        if ("STOP".equals(input)) {
            System.out.printf("%d pieces are left.", (cakePieces - pieces));
        }
    }
}
