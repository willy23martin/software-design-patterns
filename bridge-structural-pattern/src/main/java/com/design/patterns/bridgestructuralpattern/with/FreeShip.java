package com.design.patterns.bridgestructuralpattern.with;

public class FreeShip implements IShip {
    public double getAmount() {
        return 0;
    }

    public void setAmount(double amount) {
        // Not Apply
    }
}
