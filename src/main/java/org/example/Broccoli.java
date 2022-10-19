package org.example;

public class Broccoli extends Vegetable{
    private static final int DEFAULT_POWER = 10;
    private static final int DEFAULT_STAMINA = 0;
    private static final int DEFAULT_REGROW_TIME = 3;
    public Broccoli() {
        super(DEFAULT_POWER,DEFAULT_STAMINA, DEFAULT_REGROW_TIME);
    }
}
