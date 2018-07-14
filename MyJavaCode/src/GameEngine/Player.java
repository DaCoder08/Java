package GameEngine;

public class Player {
    public double health;
    private String name;
    private double weapon;
    public Player(String Name,String Weapon){
        Weapons.WeaponInit();
        this.name = Name;
        this.weapon = Weapons.getWeapons(Weapon);
        this.health = 50;
    }
    public void Attack(Player player){
        player.health -= this.weapon;
    }
}
