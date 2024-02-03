package fight_game.characters;

import fight_game.weapons.SwordBehavior;

public class King extends Character {
    public King() {
        setWeapon(new SwordBehavior());
    }
    @Override
    public void fight() {
        System.out.println("King is fight using " + weapon.useWeapon());
    }
}
