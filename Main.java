/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Create Players
        Player player1 = new Player("P001", "Player 1");
        Player player2 = new Player("P002", "Player 2");
        Player player3 = new Player("P003", "Player 3");

        // Create Characters
        Warrior Ragnar = new Warrior("WR001", " Ragnar Ironheart", 5, "Sword", "Iron Armor");
        Mage Seraphina = new Mage("MS001", "Seraphina Flameweaver", 1, "Fire");
        Rogue Shadowblade = new Rogue("RS001", "Shadowblade Vortexstrike", 10, 15, "Hidden Blade");

        // Create Skills
        Skill ironBloodedSlash = new Skill("Iron-Blooded Slash", "A powerful sword strike.");
        Skill searingBall = new Skill("Searing Ball", "Release a blazing fireball, incinerating all enemies.");
        Skill phantomAttack = new Skill("Phantom Attack", "Through swift movements and illusory attacks.");

        // Assign Skills to Characters
        Ragnar.addSkill(ironBloodedSlash);
        Seraphina.addSkill(searingBall);
        Shadowblade.addSkill(phantomAttack);

        // Assign Characters to Players 
        player1.addCharacter(Ragnar);
        player2.addCharacter(Seraphina);
        player3.addCharacter(Shadowblade);

        // Test actions
        Ragnar.chargeAttack(Shadowblade);
        Seraphina.castElementalSpell("dodging");
        Shadowblade.stab(Ragnar);
        Ragnar.shieldBlock();
        Shadowblade.evade();

        // Print Character information
        Ragnar.displayCharacterInfo();
        Seraphina.displayCharacterInfo();
        Shadowblade.displayCharacterInfo();
    }
}