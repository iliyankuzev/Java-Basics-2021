package JavaNovember2021.FirstStepInCoding.Lab;

import java.util.Scanner;

public class projectSolving {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arcName = scanner.nextLine();
        int projectUnits = Integer.parseInt(scanner.nextLine());
        int projectTime = projectUnits * 3;
        System.out.println("The architect " + arcName + " will need " + projectTime + " hours to complete " + projectUnits + " project/s.");
    }
}

