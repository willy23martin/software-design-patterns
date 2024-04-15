package com.design.patterns.bridgestructuralpattern.with;

public class ShipWithDiscount implements IShip {

    private double amount;

    public ShipWithDiscount(double discount){
        this.amount = discount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
