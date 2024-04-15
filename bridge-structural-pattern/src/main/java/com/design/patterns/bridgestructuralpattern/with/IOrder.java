package com.design.patterns.bridgestructuralpattern.with;

public interface IOrder {

    double getPrice();
    void setPrice(double price);

    IShip getShip();
    void setShip(IShip ship);

}
