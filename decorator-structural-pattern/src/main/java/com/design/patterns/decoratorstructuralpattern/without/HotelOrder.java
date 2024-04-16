package com.design.patterns.decoratorstructuralpattern.without;

public class HotelOrder implements IOrder {

    private double price;

    public HotelOrder(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
