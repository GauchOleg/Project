package com.logistic.api.model.transport;

import com.logistic.api.model.post.PostOffice;

import java.util.List;

/**
 * Created by Oleg on 03.11.2015.
 */
public class TransitClass implements Transit{
    @Override
    public List<PostOffice> getTransitOffices() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
