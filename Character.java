/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class Character {
    private String characterID;
    private String characterName;
    private int level;
    private int health;
    private final List<Skill> skills = new ArrayList<>();

    public Character(String characterID, String characterName ) {
        this.characterID = characterID;
        this.characterName = characterName ;
        this.level = 1; 
        this.health = 100;
    }

    // Getters and setters
    public String getCharacterID() {
        return characterID;
    }

    public void setCharacterID(String characterID) {
        this.characterID = characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void levelUp() {
        this.level++;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public List<Skill> getSkills() {
        return skills;
    }

    // Method to be overridden by subclasses
    public void displayCharacterInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Character{" +
                "ID='" + characterID + '\'' +
                ", Name='" + characterName + '\'' +
                ", Level=" + level +
                ", Health=" + health +
                ", Skills=" + skillsToString() +
                '}';
    }

    // Helper method to get formatted skills string
    private String skillsToString() {
        StringBuilder skillsStr = new StringBuilder();
        for (Skill skill : skills) {
            skillsStr.append(skill.getSkillName()).append(", ");
        }
        return skillsStr.length() > 0 ? skillsStr.substring(0, skillsStr.length() - 2) : "No skills";
    }
}