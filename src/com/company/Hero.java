package com.company;

public abstract class Hero implements IHavingSuperAbility {
    private int health;
    private int damage;
    private AbilityType abilityType;

    public Hero(int health, int damage, AbilityType abilityType) {
        this.health = health;
        this.damage = damage;
        this.abilityType = abilityType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public AbilityType getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(AbilityType abilityType) {
        this.abilityType = abilityType;
    }
}
