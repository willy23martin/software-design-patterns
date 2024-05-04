package com.design.patterns.commandbehavioralpattern.with.commands;

import com.design.patterns.commandbehavioralpattern.with.IOrder;

public class UpdateOrderCommand implements Command {

    private StoreOrderCommand storeOrderAction;
    private IOrder order;

    public UpdateOrderCommand(StoreOrderCommand storeOrderAction){
        this.storeOrderAction = storeOrderAction;
        this.order = storeOrderAction.getOrder();
    }

    @Override
    public void execute() {
        System.out.println("Updating order " + order.toString() + " in the database.");
        storeOrderAction.execute();
    }

    @Override
    public IOrder getOrder() {
        return order;
    }
}
