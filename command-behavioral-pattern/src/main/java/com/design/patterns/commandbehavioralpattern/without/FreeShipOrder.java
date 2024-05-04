package com.design.patterns.commandbehavioralpattern.without;

public class FreeShipOrder implements IShipOrder {

    private double price;

    public FreeShipOrder(double price) {
        this.price = price;
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
        return 0;
    }

    public void setAmount(double amount) {
        // Not Apply
    }
}
