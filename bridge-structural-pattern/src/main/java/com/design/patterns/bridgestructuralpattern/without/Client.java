package com.design.patterns.bridgestructuralpattern.without;

public class Client {

    public static void main(String... args) {
        IOrder casualOrder = new CasualOrder(1000);
        IShipOrder freeShipOrder = new FreeShipOrder(2000);
        IShipOrder shipWithDiscountOrder = new ShipWithDiscountOrder(1000, 500);

        try {
            System.out.println("Casual order: " + casualOrder);
            System.out.println("FreeShip order: " + freeShipOrder);
            System.out.println("ShipWithDiscount order: " + shipWithDiscountOrder);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
