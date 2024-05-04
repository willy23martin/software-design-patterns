package com.design.patterns.commandbehavioralpattern.without.commands;

import com.design.patterns.commandbehavioralpattern.without.IOrder;

public class StoreOrderAction {

    public StoreOrderAction(){
    }

    public void store(IOrder order) {
        System.out.println("Storing order " + order.toString() + " in the database.");
    }

}
