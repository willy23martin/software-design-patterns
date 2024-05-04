package com.design.patterns.commandbehavioralpattern.without.commands;

import com.design.patterns.commandbehavioralpattern.without.IOrder;

public class DeleteOrderAction {

    public DeleteOrderAction() {
    }

    public void delete(IOrder order) {
        System.out.println("Deleting order " + order.toString() + " in the database.");
    }

}
