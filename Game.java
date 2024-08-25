public class Game {
    public static void main(String[] args) {
        Game dublin;
        dublin = new Game();
        dublin.playerSetUp();
}

public void playerSetUp(){
    int playerHP;
    playerHP = 15;

    String playerWeapon;
    playerWeapon = "Knife";

    System.out.println("Your HP: "+ playerHP);
    System.out.println("Your weapon: "+ playerWeapon);
}
}