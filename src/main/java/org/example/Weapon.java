package org.example;

public enum Weapon {
    SWORD(80, 0.9),
    AX(120,0.5),
    KNIFE(50,0.3),
    ARROW(60,1.1);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }
    public int getDamage(){
        return damage;
    }
    public double getAttackSpeed(){
        return attackSpeed;
    }
}
