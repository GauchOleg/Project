package com.logistic.api.model.post.impl;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.post.Stamp;

import java.util.Date;

/**
 * Created by Oleg on 03.11.2015.
 */
public class StampClass implements Stamp {
    @Override
    public Address getPostOfficeAddress() {
        return null;
    }

    @Override
    public Date getStampDate() {
        return null;
    }
}
