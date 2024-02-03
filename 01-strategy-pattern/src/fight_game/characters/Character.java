package fight_game.characters;

import fight_game.weapons.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
