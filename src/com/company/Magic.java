package com.company;
import com.company.AbilityType;

public class Magic extends Hero{
    private AbilityType ability;

    public Magic(int health, int damage, AbilityType ability) {
        super(health, damage,ability);
    }

    @Override
    public void applySuperAbility(AbilityType ability) {
        System.out.println("Magic применил суперспособность " + this.getAbilityType());
    }
}
