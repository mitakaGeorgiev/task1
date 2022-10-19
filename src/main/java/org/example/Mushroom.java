package org.example;

public class Mushroom extends Vegetable {
    private static final int DEFAULT_POWER = -10;
    private static final int DEFAULT_STAMINA = -10;
    private static final int DEFAULT_REGROW_TIME = 5;

    public Mushroom() {
        super(DEFAULT_POWER, DEFAULT_STAMINA,DEFAULT_REGROW_TIME);

    }
}
