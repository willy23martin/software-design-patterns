package com.design.patterns.strategybehavioralpattern.without;

public class Client {

    public static void main(String[] args) {
        IAccount simpleAccount = new SimpleAccount();
        IAccount complexAccount = new ComplexAccount();
        IAccount freeAccount = new FreeAccount();

        System.out.println("Account tax for a SimpleAccount = " + simpleAccount.getTax());
        System.out.println("Account tax for a ComplexAccount = " + complexAccount.getTax());
        System.out.println("Account tax for a FreeAccount = " + freeAccount.getTax());
    }

}
