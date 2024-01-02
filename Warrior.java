/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Warrior extends Character {
    private final String weaponType;
    private final String armorType;

    public Warrior(String characterId, String characterName, int level, String weaponType, String armorType) {
        super(characterId, characterName);
        setLevel(level);
        this.weaponType = weaponType;
        this.armorType = armorType;
    }

    public void chargeAttack(Character target) {
    int damage;

    if (null == weaponType) {
        damage = 0;
    } else switch (weaponType) {
            case "Sword" -> {
                if (getLevel() > 5) {
                    damage = 50;
                } else {
                    damage = 25;
                }
        }
            case "Dagger" -> damage = 20;
            case "Crossbow" -> damage = 30;
            case "Stick" -> damage = 10;
            default -> damage = 0;
        }

    target.setHealth(target.getHealth() - damage);
    System.out.println(getCharacterName() + " attacks " + target.getCharacterName() +" with " + weaponType + " for " + damage + " damage!");
}

    public void shieldBlock() {
        String message;
        message = switch (armorType) {
            case "Shield" -> getCharacterName() + " is raising its shield.";
            case "Helmet" -> getCharacterName() + " protected the head.";
            default -> getCharacterName() + " opps! is miss the protected.";
        };
        System.out.println(message);
    }

    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Weapon Type: " + weaponType);
        System.out.println("Armor Type: " + armorType);
    }

    @Override
    public String toString() {
        return super.toString() + ", Weapon Type: " + weaponType + ", Armor Type: " + armorType;
    }
}