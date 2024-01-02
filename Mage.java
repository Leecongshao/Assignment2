/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Mage extends Character {
    private final String elementalForce;

    public Mage(String characterId, String characterName, int level, String elementalForce) {
super(characterId, characterName);
        setLevel(level);
        this.elementalForce = elementalForce;
    }

    public void castElementalSpell(String spellType) {
        if (getLevel() < 3) {
            System.out.println(getCharacterName() + " need to up to 3 level can cast the elemental.");
            return;
        }
        String message;
        message = switch (spellType) {
            case "dodge" -> "dodging " + getCharacterName() + " avoid danger!";
            case "confusion" -> getCharacterName() + " create chaos and make enemies dizzy.";
            case "explore" -> getCharacterName() + " Find nearby enemies.";
            default -> "spell error.";
        };
        System.out.println(message);
    }

    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Elemental Froce: " + elementalForce);
    }

    @Override
    public String toString() {
        return super.toString() + ", Elemental Froce: " + elementalForce;
    }
}