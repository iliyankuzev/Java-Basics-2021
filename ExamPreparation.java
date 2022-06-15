package JavaNovember2021.WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int poorGrades = Integer.parseInt(scanner.nextLine());

        int countExercise = 0;
        int countPoorGrades = 0;

        double sumOfGrades = 0;
        String lastProblem = "";
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Enough")) {

            int grades = Integer.parseInt(scanner.nextLine());

            if (grades <= 4) {
                countPoorGrades++;
            }
            if (countPoorGrades >= poorGrades) {
                break;
            }
            sumOfGrades = sumOfGrades + grades;
            countExercise++;
            lastProblem = inputLine;
            inputLine = scanner.nextLine();

        }
        double avgGrade = sumOfGrades / countExercise;
        if (inputLine.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", avgGrade);
            System.out.printf("Number of problems: %d%n", countExercise);
            System.out.printf("Last problem: %s%n",lastProblem );
        }else{
            System.out.printf("You need a break, %d poor grades.",countPoorGrades);
        }
    }
}
