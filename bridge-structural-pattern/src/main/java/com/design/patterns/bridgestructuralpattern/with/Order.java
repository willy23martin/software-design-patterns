package com.design.patterns.bridgestructuralpattern.with;

public class Order implements IOrder {

    private double price;

    private IShip ship;

    public Order(double price, IShip ship) {
        this.price = price;
        this.ship = ship;
    }

    public double getPrice() {
        return price - ship.getAmount();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public IShip getShip() {
        return ship;
    }

    public void setShip(IShip ship) {
        this.ship = ship;
    }

    public String toString(){
        return "Price: " + getPrice();
    }

}
