package com.isep.rpg;

public class Dragon extends Ennemy {

    public Dragon(String n) {
        super(n, 5, 3);
    }

    @Override
    public void fight(Combatant combatant) {
        combatant.loose( getDamagePoints() );
    }
}
