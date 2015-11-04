package com.logistic.impl.model.post;

import com.logistic.api.model.person.Address;

import java.util.Date;

/**
 *
 */
public class Stamp implements com.logistic.api.model.post.Stamp { // class stamp implements com.logistic
    private Address postOfficeAddress; // initialization address post office witch help constructor
    private Date stampDate; // initialization stamp date witch help constructor

    public Stamp(Address address, Date date) { // constructor stamp
        this.postOfficeAddress = address; // initialization post office to have variable address
        this.stampDate = date; // initialization stamp date to have variable date
    }

    @Override
    public Address getPostOfficeAddress() {
        return this.postOfficeAddress;
    }
    // override method get post office address
    @Override
    public Date getStampDate() {
        return this.stampDate;
    }
    // override method get stamp date
}
