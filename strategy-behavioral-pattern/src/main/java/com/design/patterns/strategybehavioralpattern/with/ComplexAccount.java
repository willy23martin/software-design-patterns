package com.design.patterns.strategybehavioralpattern.with;

public class ComplexAccount implements Strategy {

    @Override
    public double execute() {
        return 0.07;
    }
}
