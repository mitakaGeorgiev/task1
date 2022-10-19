package org.example;

public abstract class Vegetable {
    public int power;
    public int stamina;
public int regrowTime;
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Vegetable(int power, int stamina,int regrowTime) {
        this.power = power;
        this.stamina = stamina;
    }
}
