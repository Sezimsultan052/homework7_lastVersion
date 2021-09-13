package com.company;


public class Main {

    public static void main(String[] args) {
        Hero heroes[] = new Hero[3];
        heroes[0] = new Medic(100, 10,AbilityType.SAVE_DAMAGE_AND_REVERT);
        heroes[1] = new Warrior(200, 20, AbilityType.CRITICAL_DAMAGE);
        heroes[2] = new Magic(300, 30, AbilityType.HEAL);

        for(Hero hero: heroes){
            hero.applySuperAbility(hero.getAbilityType());
        }
    }
}
