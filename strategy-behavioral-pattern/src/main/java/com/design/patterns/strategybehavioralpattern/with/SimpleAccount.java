package com.design.patterns.strategybehavioralpattern.with;

public class SimpleAccount implements Strategy {
    @Override
    public double execute() {
        return 0.1;
    }
}
