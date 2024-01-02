/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Rogue extends Character {
    private final int speedLevel;
    private final String daggerType;

    public Rogue(String characterId, String characterName, int level, int speedLevel, String daggerType) {
        super(characterId, characterName);
        setLevel(level);
        this.speedLevel = speedLevel;
        this.daggerType = daggerType;
    }

    public void stab(Character target) {
        int damage;
        if (getLevel() <= 3) {
            damage = 5;
        } else if (getLevel() <= 5) {
            damage = 7;
        } else {
            damage = 10;
        }
        target.setHealth(target.getHealth() - damage);
        System.out.println(getCharacterName() + " stabs " + target.getCharacterName() + " with " + daggerType + " for " + damage + " damage!");
    }

    public void evade() {
        String message;
        if (speedLevel < 5) {
            message = getCharacterName() + " need a higher speed level to evade the attacks.";
        } else {
            message = getCharacterName() + " successfully evades the attack.";
        }
        System.out.println(message);
    }

    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Speed Level: " + speedLevel);
        System.out.println("Dagger Type: " + daggerType);
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed Level: " + speedLevel + ", Dagger Type: " + daggerType;
    }
}

