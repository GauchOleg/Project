package com.logistic.api.model.transport;

import com.logistic.api.model.post.PostOffice;

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
