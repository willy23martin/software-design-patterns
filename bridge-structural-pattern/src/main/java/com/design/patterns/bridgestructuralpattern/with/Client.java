package com.design.patterns.bridgestructuralpattern.with;

public class Client {

    public static void main(String[] args) {
        IOrder casualOrder = new Order(1000, new CasualShip());
        IOrder freeShipOrder = new Order(2000, new FreeShip());
        IOrder shipWithDiscountOrder = new Order(1000, new ShipWithDiscount(500));

        try {
            System.out.println("Casual order: " + casualOrder);
            System.out.println("FreeShip order: " + freeShipOrder);
            System.out.println("ShipWithDiscount order: " + shipWithDiscountOrder);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
