package JavaNovember2021.WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());

        int freeCubicArea = width * lenght * wide;
        String input = scanner.nextLine();
        int cubicBox = 1;
        int totalBoxArea = 0;
        while (!"Done".equals(input)) {
            int numberOfBoxes = Integer.parseInt(input);

            totalBoxArea += numberOfBoxes;

            if (freeCubicArea < totalBoxArea) {
                System.out.printf("No more free space! You need %d Cubic meters more.", totalBoxArea - freeCubicArea);
                break;
            }
            input = scanner.nextLine();
        }
        if ("Done".equals(input)){
            System.out.printf("%d Cubic meters left.", freeCubicArea - totalBoxArea);
        }
    }
}
