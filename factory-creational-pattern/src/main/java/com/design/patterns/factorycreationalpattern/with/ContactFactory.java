package com.design.patterns.factorycreationalpattern.with;

public class ContactFactory {

    public static final int REGULAR_CONTACT = 0;
    public static final int TELEMARKETING_CONTACT = 1;

    public IContact createContact(int type, String phone) {
        switch (type) {
            case REGULAR_CONTACT: return new RegularContact(phone); // Intentionally left here just for educational purposes because it is redundant.
            case TELEMARKETING_CONTACT: return new TelemarketingContact(phone);
            default: return new RegularContact(phone);
        }
    }

}
