package com.design.patterns.factorycreationalpattern.with;

public class FactoryClient {

    public static void main(String[] args) {
        ContactFactory contactFactory = new ContactFactory();
        IContact regularContact = contactFactory.createContact(ContactFactory.REGULAR_CONTACT, "6025546566");
        IContact telemarketingContact = contactFactory.createContact(ContactFactory.TELEMARKETING_CONTACT, "3215469857");
        System.out.println("Regular contact: " + regularContact.callContact());
        System.out.println("Telemarketing contact: " + telemarketingContact.callContact());
    }

}
