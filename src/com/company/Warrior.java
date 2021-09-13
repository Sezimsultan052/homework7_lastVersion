package com.company;

public class Warrior extends Hero{
    private AbilityType ability;
    public Warrior(int health, int damage, AbilityType ability) {
        super(health, damage, ability);
    }

    @Override
    public void applySuperAbility(AbilityType ability) {
        System.out.println("Warrior применил суперспособность " + this.getAbilityType());
    }
}
