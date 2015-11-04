package com.logistic.api.model.transport.impl;

import com.logistic.api.model.post.PostOffice;
import com.logistic.api.model.transport.DeliveryTransport;

/**
 * Created by Oleg on 03.11.2015.
 */
public abstract class DeliveryTransportClass implements DeliveryTransport {
    DeliveryTransport deliveryTransport = new DeliveryTransport() {
        @Override
        public Type getType() {
            return this.getType();
        }

        @Override
        public PostOffice getStartPostOffice() {
            return this.getDestinationPostOffice();
        }

        @Override
        public PostOffice getDestinationPostOffice() {
            return this.getDestinationPostOffice();
        }
    };
    Type type = deliveryTransport.getType();
    PostOffice getDestinationPosrOffice = deliveryTransport.getDestinationPostOffice();
    PostOffice getStartPostOffice = deliveryTransport.getStartPostOffice();
}
