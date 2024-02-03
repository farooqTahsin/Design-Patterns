package fight_game.characters;

import fight_game.weapons.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        setWeapon(new BowAndArrowBehavior());
    }
    @Override
    public void fight() {
        System.out.println("Queen is fight using " + weapon.useWeapon());
    }
}
