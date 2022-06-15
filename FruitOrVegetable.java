package JavaNovember2021.complexConditionalStatements.lab;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;


       // if (input.equals("banana"+"apple"+"kiwi"+"cherry"+"lemon" +"grapes")){
       //     System.out.println("fruit");
       // }else if (input.equals("tomato"+"cucumber"+"pepper"+"carrot")){
       //     System.out.println("vegetable");
       // }else{
       //     System.out.println("unknown");
        }
    }
}
