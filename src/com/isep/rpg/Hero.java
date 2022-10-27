package com.isep.rpg;

public abstract class Hero extends Combatant {

    public Hero(String n, int h) {
        super(n, h);
    }

    public abstract void use(Item item);
}
