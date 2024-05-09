package com.design.patterns.strategybehavioralpattern.without;

public class ComplexAccount implements IAccount {

    @Override
    public double getTax() {
        return 0.07;
    }
}
