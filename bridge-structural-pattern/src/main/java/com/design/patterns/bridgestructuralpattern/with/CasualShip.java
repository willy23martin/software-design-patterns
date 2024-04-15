package com.design.patterns.bridgestructuralpattern.with;

public class CasualShip implements IShip {

    public CasualShip() {
    }

    @Override
    public double getAmount() {
        return 600;
    }

    @Override
    public void setAmount(double amount) {
        // Not Apply
    }
}
