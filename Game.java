import java.util.Scanner;

public class Game {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in); 
    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    int monsterHP;
    int silverRing; 
    public static void main(String[] args) {
        Game dublin;
        dublin = new Game();
        dublin.playerSetUp();
        dublin.townGate();
}

public void playerSetUp(){

    playerHP = 10;
    monsterHP = 15;


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
    System.out.println("-----------------------------------------");


    choice = myScanner.nextInt();
    if(choice==1){
        if(silverRing==1){
            ending();
        }
        else{
        System.out.println("Guard: Hello there, Stanger! So, your name is "+playerName+"? Sorry, but we cannot let a stranger enter our town.");
        enterScanner.nextLine();
        townGate();
        }
    }
    else if(choice==2){
        playerHP = playerHP-1;
        System.out.println("Guard: Hey don't be stupid.\nThe guard hit you so hard and you gave up.\n(You recieved 1 damage)\n");
        System.out.println("Your HP: "+playerHP);
        enterScanner.nextLine();
        townGate();

    }
    else if(choice==3){
        crossRoad();
    }
    else{
        townGate();
    }
    }
    public void crossRoad(){
        System.out.println("-----------------------------------------");
        System.out.println("You are at a crossroad. If you go south, you will go back to town.\n\n");
        System.out.println("1: Go North");
        System.out.println("2: Go East");
        System.out.println("3: Go South");
        System.out.println("4: Go West");
        System.out.println("-----------------------------------------");

        choice = myScanner.nextInt();

        if(choice==1){
            north();
        }
        if(choice==2){
            east();
        }
        if(choice==3){
            townGate();
        }
        if(choice==4){
            west();
        }
        else{
            crossRoad();
        }
    }
    public void north(){
        System.out.println("-----------------------------------------");
        System.out.println("There is a river. You drink the water and rest at the riverside.");
        System.out.println("Your HP is recovered.");
        playerHP = playerHP + 1;
        System.out.println("Your HP: "+playerHP);
        System.out.println("\n\n1: Go back to crossroad");
        System.out.println("-----------------------------------------");

        choice = myScanner.nextInt();

        if(choice==1){
            crossRoad();
        }
        else{
            north();
        }
    }
    public void east(){
        System.out.println("-----------------------------------------");
        System.out.println("You walked into a forest and found a Long Sword!");
        playerWeapon = "Long Sword";
        System.out.println("Your weapon: "+ playerWeapon);
        System.out.println("\n\n1: Go back to crossroad");
        System.out.println("-----------------------------------------");

        choice = myScanner.nextInt();

        if(choice==1){
            crossRoad();
        }
        else{
            east();
        }
    }
    public void west(){
        System.out.println("-----------------------------------------");
        System.out.println("You encounter a goblin.\n");
        System.out.println("1: Fight");
        System.out.println("2: Run");
        System.out.println("-----------------------------------------");

        choice = myScanner.nextInt();

        if(choice==1){
            fight();
        }
        if(choice==2){
            crossRoad();
        }
        else{
            west();
        }
    }
    public void fight(){
        System.out.println("-----------------------------------------");
        System.out.println("Your HP: "+playerHP);
        System.out.println("Monster's HP: "+monsterHP);
        System.out.println("\n1: Attack");
        System.out.println("\n2: Run");
        System.out.println("-----------------------------------------");

        choice = myScanner.nextInt();

        if(choice==1){
            attack();
        }
        if(choice==2){
            crossRoad();
        }
        else{
            fight();
        }
    }
    public void attack(){
        int playerDamage = 0;

        if(playerWeapon.equals("Knife")){
            playerDamage = new java.util.Random().nextInt(5);
        }
        if(playerWeapon.equals("Long Sword")){
            playerDamage = new java.util.Random().nextInt(8);
        }

        System.out.println("You attacked the monster and gave " +playerDamage+" damage!");
        monsterHP= monsterHP - playerDamage;
        System.out.println("Monster HP: "+monsterHP);

        if(monsterHP<1){
            win();
        }
        if(monsterHP>0){
            int monsterDamage = 0;
            monsterDamage = new java.util.Random().nextInt(4);
            System.out.println("The monster attacked you and gave you "+ monsterDamage + "damage!");
            playerHP = playerHP - monsterDamage;
            System.out.println("Your HP: "+playerHP);
            
            if(playerHP<1){
                dead();
            }
            if(playerHP>0){
                fight();
            }
        }
       
    
    }
    public void dead(){
        System.out.println("-----------------------------------------");
        System.out.println("You are dead!!");
        System.out.println("-----------------------------------------");
    }
    public void win(){
        System.out.println("-----------------------------------------");
        System.out.println("You killed the monster!!");
        System.out.println("The monster dropped a ring");
        System.out.println("You obtained a silver ring!\n");
        System.out.println("1: Go East");
        System.out.println("-----------------------------------------");

        silverRing = 1;

        choice = myScanner.nextInt();

        if(choice==1){
            east();
        }
        else{
            win();
        }
    }
    public void ending(){
        System.out.println("\n-----------------------------------------\n");
        System.out.println("Guard: Oh, so you killed the goblin?? Great!");
        System.out.println("Guard: It seems you are a trustworthy guy. Welcome to our town!");
        
        System.out.println("\n\n            THE END             ");
        System.out.println("\n-----------------------------------------\n");
    }

}
