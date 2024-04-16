package com.design.patterns.decoratorstructuralpattern.with;

public class CarOrder implements IOrder {

    private double price;

    public CarOrder(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
