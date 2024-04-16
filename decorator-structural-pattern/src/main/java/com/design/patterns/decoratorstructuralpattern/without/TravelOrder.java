package com.design.patterns.decoratorstructuralpattern.without;

public class TravelOrder implements IOrder {

    private double price;

    public TravelOrder(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
