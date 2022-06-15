package JavaNovember2021.FirstStepInCoding.Exercise;

import java.util.Scanner;

public class P4BooksForSummer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int timeForReadingOneBook = numberOfPages / pagesPerHour;
        int readingDays = timeForReadingOneBook / numberOfDays;

        System.out.println(readingDays);
    }
}
