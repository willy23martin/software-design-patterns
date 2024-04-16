package com.design.patterns.decoratorstructuralpattern.without;

public class HotelCarOrder implements IPackageOrder {

    private double price;

    public HotelCarOrder(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
