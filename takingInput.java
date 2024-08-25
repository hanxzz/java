import java.util.Scanner;

public class takingInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //create a Scanner object
        String playerName;

        System.out.println("Please enter your name:");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName);
        System.out.println("Please enter your age:");
        int age;
        age = scanner.nextInt();
        System.out.println("You are "+ age + " years old.");
    }
}
