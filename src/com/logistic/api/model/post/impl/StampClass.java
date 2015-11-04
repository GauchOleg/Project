package com.logistic.api.model.post.impl;
import com.logistic.api.model.person.Address;
import com.logistic.api.model.post.Stamp;
import java.util.Date;
/**
 * Created by Oleg on 03.11.2015.
 */
    public abstract class StampClass implements Stamp {
        Stamp stamp = new Stamp() {
            @Override
            public Address () {
                return this.getPostOfficeAddress();
            }

            @Override
            public Date getStampDate() {
                return this.getStampDate();
            }
        };
    Address getPostOfficeAddress = stamp.getPostOfficeAddress();
    Date getStampDate = stamp.getStampDate();
}
