package com.design.patterns.decoratorstructuralpattern.without;

public class TravelCarPackageOrder implements IPackageOrder {

    private double price;

    public TravelCarPackageOrder(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
