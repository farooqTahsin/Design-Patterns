package fight_game.characters;

import fight_game.weapons.AxeBehavior;

public class Knight extends Character {
    public Knight() {
        setWeapon(new AxeBehavior());
    }
    @Override
    public void fight() {
        System.out.println("Knight is fight using " + weapon.useWeapon());
    }
}
