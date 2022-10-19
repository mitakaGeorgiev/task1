package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ninja {
    private static final int DEFAULT_POWER = 1;
    private static final int DEFAULT_STAMINA = 1;
    private static final int DEFAULT_ROW_POSITION = 0;
    private static final int DEFAULT_COLUMN_POSITION = 0;
    private String name;
    private int power;
    private int stamina;
    private int rowPosition;
    private int columnPosition;
    private List<Vegetable> bag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Ninja(String name) {
        this.name = name;
        this.power = DEFAULT_POWER;
        this.stamina = DEFAULT_STAMINA;
        this.columnPosition = DEFAULT_COLUMN_POSITION;
        this.rowPosition = DEFAULT_ROW_POSITION;
        bag = new ArrayList<>();
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public List<Vegetable> getBag() {
        return bag;
    }

    public void setBag(List<Vegetable> bag) {
        this.bag = bag;
    }
}
