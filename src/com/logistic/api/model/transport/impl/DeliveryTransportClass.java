package com.logistic.api.model.transport.impl;

import com.logistic.api.model.post.PostOffice;
import com.logistic.api.model.transport.DeliveryTransport;

/**
 * Created by Oleg on 03.11.2015.
 */
public class DeliveryTransportClass implements DeliveryTransport {
    @Override
    public Type getType() {
        return null;
    }

    @Override
    public PostOffice getStartPostOffice() {
        return null;
    }

    @Override
    public PostOffice getDestinationPostOffice() {
        return null;
    }
}
