package fight_game.characters;

import fight_game.weapons.KnifeBehavior;

public class Troll extends Character {
    public Troll() {
        setWeapon(new KnifeBehavior());
    }
    @Override
    public void fight() {
        System.out.println("Troll is fight using " + weapon.useWeapon());
    }
}
