package com.design.patterns.decoratorstructuralpattern.with;

public class HotelDecorator implements IPackageDecorator {

    private double price;

    private IOrder order;

    public HotelDecorator(double price, IOrder order) {
        this.price = price + order.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
