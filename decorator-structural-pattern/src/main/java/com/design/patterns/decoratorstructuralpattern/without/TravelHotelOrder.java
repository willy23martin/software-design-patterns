package com.design.patterns.decoratorstructuralpattern.without;

public class TravelHotelOrder implements IPackageOrder {

    private double price;

    public TravelHotelOrder(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
