package com.company;

public class Medic extends Hero{
    public Medic(int health, int damage,AbilityType ability) {
        super(health, damage, ability);
    }

    @Override
    public void applySuperAbility(AbilityType ability) {
        System.out.println("Medic применил суперспособность " + this.getAbilityType());
    }
}
