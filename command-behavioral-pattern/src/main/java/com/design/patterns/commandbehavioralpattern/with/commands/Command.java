package com.design.patterns.commandbehavioralpattern.with.commands;

import com.design.patterns.commandbehavioralpattern.with.IOrder;

public interface Command {

    public void execute();
    public IOrder getOrder();

}
