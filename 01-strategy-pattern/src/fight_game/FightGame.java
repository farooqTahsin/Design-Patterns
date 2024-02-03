package fight_game;

/*
    The Strategy Pattern defines a family of algorithms,
    encapsulates each one, and makes them interchangeable.
    Strategy lets the algorithm vary independently from
    clients that use it.
*/

import fight_game.characters.Character;
import fight_game.characters.King;
import fight_game.characters.Queen;
import fight_game.weapons.AxeBehavior;
import fight_game.weapons.KnifeBehavior;
public class FightGame {
    public static void main (String[]args) {

        Character character = new King();
        character.fight();

        character.setWeapon(new AxeBehavior());
        character.fight();

        character = new Queen();
        character.fight();

        character.setWeapon(new KnifeBehavior());
        character.fight();
    }
}
