package com.design.patterns.strategybehavioralpattern.with;

public class Context {

    private Strategy strategy;

    public Context() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getTax(){
        return strategy.execute();
    }

}
