package com.design.patterns.commandbehavioralpattern.without;

public class CasualOrder implements IOrder {

    private double price;

    public CasualOrder(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Price: " + price;
    }

}
