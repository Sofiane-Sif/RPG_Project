package com.isep.rpg;

import com.isep.utils.InputParser;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public Game(InputParser inputParser) {

        this.inputParser = inputParser;

        heros = new ArrayList<>();

        Hero ronal = new Warrior("Ronal");
        ronal.use( new Weapon("knife", 1));
        heros.add(ronal);

        Hero conan = new Warrior("Conan");
        ronal.use( new Weapon("sword", 2));
        heros.add(conan);

        enemies = new ArrayList<>();
        enemies.add( new Dragon("Dracofeu") );
        enemies.add( new Dragon("Smaug") );
    }

    public void start() {
        int ixHero = 0;
        while (true) {

            displayStatus();

            Combatant goodOne = heros.get(ixHero);
            Combatant badOne = enemies.get(0);

            // Attaque des ennemis
            displayMessage("Le méchant " + badOne.getName()
                    + " attaque le gentil " + goodOne.getName() + "...");
            badOne.fight(goodOne);
            if (goodOne.getHealthPoint() <= 0) {
                displayMessage("Le pauvre " + goodOne.getName() + " a été vaincu...");
                heros.remove(ixHero);
            } else {

                // Riposte des gentils
                displayMessage("Le gentil " + goodOne.getName()
                        + " attaque le méchant " + badOne.getName() + "...");
                goodOne.fight(badOne);
                if (badOne.getHealthPoint() <= 0) {
                    displayMessage("Bravo, " + goodOne.getName()
                            + " a vaincu " + badOne.getName() + " !!!");
                    enemies.remove(0);
                }

            }

            if (heros.size() == 0) {
                displayMessage("BRAVO, les héros ont gagné !!!");
                break;
            }
            if (enemies.size() == 0) {
                displayMessage("Les héros ont perdu, c'est la fin du monde...");
                break;
            }
            ixHero++;
        }
    }

    private void displayStatus() {
        for (Combatant c: heros) {
            System.out.print(c.getName() + "(" + c.getHealthPoint() + ") ");
        }
        System.out.println();
        for (Combatant c: enemies) {
            System.out.print(c.getName() + "(" + c.getHealthPoint() + ") ");
        }
        System.out.println();
    }

    private void displayMessage(String message) {
        System.out.println(message);
    }

    private InputParser inputParser;

    private List<Combatant> heros;
    private List<Combatant> enemies;
}
