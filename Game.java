import java.util.Scanner;

public class Game {

    Scanner myScanner = new Scanner(System.in);
    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    public static void main(String[] args) {
        Game dublin;
        dublin = new Game();
        dublin.playerSetUp();
        dublin.townGate();
}

public void playerSetUp(){

    playerHP = 15;


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


    choice = myScanner.nextInt();
    if(choice==1){
        System.out.println("Guard: Hello there, Stanger! So, your name is "+playerName+"? Sorry, but we cannot let a stranger enter our town.");
        townGate();
    }
    else if(choice==2){
        playerHP = playerHP-1;
        System.out.println("Guard: Hey don't be stupid.\nThe guard hit you so hard and you gave up\n(You recieved 1 damage)");
        System.out.println("Your HP: "+playerHP);
        townGate();

    }
    else if(choice==3){

    }
    }

}
