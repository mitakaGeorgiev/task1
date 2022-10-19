package org.example;

public class CherryBerry extends Vegetable{
    private static final int DEFAULT_POWER = 0;
    private static final int DEFAULT_STAMINA = 10;
    private static final int DEFAULT_REGROW_TIME = 5;

    public CherryBerry() {
        super(DEFAULT_POWER,DEFAULT_STAMINA,DEFAULT_REGROW_TIME );
    }
}
