package com.isep.rpg;

public class Warrior extends Hero {

    public Warrior(String n) {
        super(n, 5);
    }

    @Override
    public void fight(Combatant combatant) {
        combatant.loose( weapon.getDamagePoints() );
    }

    @Override
    public void use(Item item) {
        if (item instanceof Weapon) {
            weapon = (Weapon) item;
        }
    }

    private Weapon weapon;
}
