package com.design.patterns.commandbehavioralpattern.with;

import com.design.patterns.commandbehavioralpattern.with.commands.DeleteOrderCommand;
import com.design.patterns.commandbehavioralpattern.with.commands.StoreOrderCommand;
import com.design.patterns.commandbehavioralpattern.with.commands.UpdateOrderCommand;

public class Client {

    public static void main(String... args) {
        IShipOrder freeShipOrder = new FreeShipOrder(2000);

        StoreOrderCommand storeOrderAction = new StoreOrderCommand(freeShipOrder);
        UpdateOrderCommand updateOrderAction = new UpdateOrderCommand(storeOrderAction);
        DeleteOrderCommand deleteOrderAction = new DeleteOrderCommand(freeShipOrder);

        try {
            System.out.println("FreeShip order: " + freeShipOrder);

            storeOrderAction.execute();
            updateOrderAction.execute();
            deleteOrderAction.execute();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
