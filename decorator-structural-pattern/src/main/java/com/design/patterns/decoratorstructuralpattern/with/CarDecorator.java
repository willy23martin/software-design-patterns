package com.design.patterns.decoratorstructuralpattern.with;

public class CarDecorator implements IPackageDecorator {

    private double price;

    private IOrder order;

    public CarDecorator(double price, IOrder order) {
        this.price = price + order.getPrice();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
