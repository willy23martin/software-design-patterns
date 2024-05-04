package com.design.patterns.commandbehavioralpattern.with.commands;

import com.design.patterns.commandbehavioralpattern.with.IOrder;

public class DeleteOrderCommand implements Command {

    private IOrder order;

    public DeleteOrderCommand(IOrder order) {
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Deleting order " + order.toString() + " in the database.");
    }

    @Override
    public IOrder getOrder() {
        return order;
    }
}
