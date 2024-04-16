package com.design.patterns.decoratorstructuralpattern.with;

public class CarHotelTravelOrder implements IPackageDecorator {

    private double price;

    public CarHotelTravelOrder(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
