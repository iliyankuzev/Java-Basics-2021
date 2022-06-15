package JavaNovember2021.WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSteps = 10000;
        int totalSteps = 0;
        int count = 0;

        String input = scanner.nextLine();

        while (!"Going home".equals(input)) {

            int steps = Integer.parseInt(input);

            totalSteps += steps;

            if (totalSteps >= targetSteps){
                break;
            }
            input = scanner.nextLine();

        }
        if ("Going home".equals(input)){
            input = scanner.nextLine();
            int steps = Integer.parseInt(input);
            totalSteps += steps;

        }
        if (totalSteps >= targetSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.println((totalSteps - targetSteps) + " steps over the goal!");
        } else {
            System.out.println((targetSteps - totalSteps) + " more steps to reach goal.");
        }
    }
}
