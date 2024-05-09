package com.design.patterns.strategybehavioralpattern.with;

public class Client {

    public static void main(String[] args) {
        Strategy simpleAccount = new SimpleAccount();
        Strategy complexAccount = new ComplexAccount();
        Strategy freeAccount = new FreeAccount();

        Context context = new Context();

        context.setStrategy(simpleAccount);
        System.out.println("Account tax for a SimpleAccount = " + context.getTax());

        context.setStrategy(complexAccount);
        System.out.println("Account tax for a ComplexAccount = " + context.getTax());

        context.setStrategy(freeAccount);
        System.out.println("Account tax for a FreeAccount = " + context.getTax());
    }

}
