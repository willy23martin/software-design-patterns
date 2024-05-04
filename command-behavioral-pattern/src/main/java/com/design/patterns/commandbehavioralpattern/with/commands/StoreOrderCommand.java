package com.design.patterns.commandbehavioralpattern.with.commands;

import com.design.patterns.commandbehavioralpattern.with.IOrder;

public class StoreOrderCommand implements Command {

    private IOrder order;

    public StoreOrderCommand(IOrder order){
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Storing order " + order.toString() + " in the database.");
    }

    @Override
    public IOrder getOrder() {
        return order;
    }
}
