package com.design.patterns.commandbehavioralpattern.without.commands;

import com.design.patterns.commandbehavioralpattern.without.IOrder;

public class UpdateOrderAction {

    private StoreOrderAction storeOrderAction;

    public UpdateOrderAction(StoreOrderAction storeOrderAction){
        this.storeOrderAction = storeOrderAction;
    }

    public void update(IOrder order) {
        System.out.println("Updating order " + order.toString() + " in the database.");
        storeOrderAction.store(order);
    }

}
