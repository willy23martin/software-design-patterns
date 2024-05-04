package com.design.patterns.commandbehavioralpattern.without;

public class ShipWithDiscountOrder implements IShipOrder {

    private double price;

    private double amount;

    public ShipWithDiscountOrder(double price, double amount) {
        this.price = price;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Price: " + price;
    }

    public double getAmount() {
        return amount * 0.45;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
