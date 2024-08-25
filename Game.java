import java.util.Scanner;

public class Game {

    Scanner myScanner = new Scanner(System.in);
    int playerHP;
    String playerName;
    public static void main(String[] args) {
        Game dublin;
        dublin = new Game();
        dublin.playerSetUp();
        dublin.townGate();
}

public void playerSetUp(){

    playerHP = 15;

    String playerWeapon;
    playerWeapon = "Knife";

    System.out.println("Your HP: "+ playerHP);
    System.out.println("Your weapon: "+ playerWeapon);

    

    System.out.println("Please enter your name");
    playerName = myScanner.nextLine();
    System.out.println("Hello, " + playerName +".");
}

public void townGate(){
    System.out.println(" ");
    System.out.println("-----------------------------------------");
    System.out.println(" ");
    System.out.println("You are at the gate of town.");
    System.out.println("A guard is standing infront of you");
    System.out.println(" ");
    System.out.println("What do you want to do?");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("1: Talk to guard");
    System.out.println("2: Attack the guard");
    System.out.println("3: Leave");

    int choice;
    choice = myScanner.nextInt();

}
}