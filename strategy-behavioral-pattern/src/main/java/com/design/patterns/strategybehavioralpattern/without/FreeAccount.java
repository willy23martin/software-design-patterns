package com.design.patterns.strategybehavioralpattern.without;

public class FreeAccount implements  IAccount {

    @Override
    public double getTax() {
        return 0;
    }
}
