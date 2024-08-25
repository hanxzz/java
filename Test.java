public class Test {
    public static void main(String[] args) {
        Test test;
        test = new Test();
        test.playerSetUp();
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

