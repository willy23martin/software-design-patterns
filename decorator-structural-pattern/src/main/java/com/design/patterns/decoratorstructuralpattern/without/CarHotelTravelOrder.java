package com.design.patterns.decoratorstructuralpattern.without;

public class CarHotelTravelOrder implements  IPackageOrder {

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
