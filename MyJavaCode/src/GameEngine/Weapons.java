package GameEngine;

import java.util.HashMap;

public class Weapons {
    private static HashMap<String, Double> Weapons = new HashMap<>();

    public static void WeaponInit() {
        Weapons.put("GUN",7.5);
        Weapons.put("SWORD",5.0);
        Weapons.put("BOW",6.5);
        Weapons.put("SPEAR",4.5);
        Weapons.put("BOMB",9.5);
        Weapons.put("MAGIC",10.0);
        Weapons.put("FISTS",2.0);
    }
    public static Double getWeapons(String weapon){
        return Weapons.get(weapon);
    }
}
