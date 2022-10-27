package com.isep.rpg;

public abstract class Combatant {

    public Combatant(String n, int h) {
        name = n;
        healthPoint = h;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public abstract void fight(Combatant combatant);

    public void loose(int hp) {
        // healthPoint = healthPoint - hp;
        healthPoint -= hp;
    }

    private String name;
    private int healthPoint;
}
