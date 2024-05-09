package com.design.patterns.strategybehavioralpattern.without;

public class SimpleAccount implements IAccount {

    @Override
    public double getTax() {
        return 0.1;
    }
}
