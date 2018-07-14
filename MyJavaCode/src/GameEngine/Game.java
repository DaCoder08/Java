package GameEngine;

public class Game {
    public static void main(String args[]){
        Player p1 = new Player("Player 1","SWORD");
        Player p2 = new Player("Player 2","GUN");
        p1.Attack(p2);
        p2.Attack(p1);
        System.out.println("Player 1 Health: "+p1.health+"\n"+"Player 2 Health: "+p2.health);
    }
}
