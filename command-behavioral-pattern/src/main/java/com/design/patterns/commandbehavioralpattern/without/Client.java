package com.design.patterns.commandbehavioralpattern.without;

import com.design.patterns.commandbehavioralpattern.without.commands.DeleteOrderAction;
import com.design.patterns.commandbehavioralpattern.without.commands.StoreOrderAction;
import com.design.patterns.commandbehavioralpattern.without.commands.UpdateOrderAction;

public class Client {

    public static void main(String... args) {
        IOrder casualOrder = new CasualOrder(1000);
        IShipOrder freeShipOrder = new FreeShipOrder(2000);
        IShipOrder shipWithDiscountOrder = new ShipWithDiscountOrder(1000, 500);

        StoreOrderAction storeOrderAction = new StoreOrderAction();
        UpdateOrderAction updateOrderAction = new UpdateOrderAction(storeOrderAction);
        DeleteOrderAction deleteOrderAction = new DeleteOrderAction();

        try {
            System.out.println("Casual order: " + casualOrder);
            System.out.println("FreeShip order: " + freeShipOrder);
            System.out.println("ShipWithDiscount order: " + shipWithDiscountOrder);

            storeOrderAction.store(casualOrder);
            storeOrderAction.store(freeShipOrder);
            storeOrderAction.store(shipWithDiscountOrder);

            updateOrderAction.update(casualOrder);
            deleteOrderAction.delete(freeShipOrder);

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
