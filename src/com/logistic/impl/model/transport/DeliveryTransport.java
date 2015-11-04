package com.logistic.impl.model.transport;

import com.logistic.api.model.post.PostOffice;

/**
 *
 */
public class DeliveryTransport implements com.logistic.api.model.transport.DeliveryTransport { // delivery implements com.logistic
    private Type type;  // initialization type
    private PostOffice startOffice; // initialization start post office
    private PostOffice destinationOffice; // initialization destination office

    public DeliveryTransport(Type type, PostOffice startOffice, PostOffice destinationOffice) { // constructor delivery transport
        this.type = type; // initialization type delivery
        this.startOffice = startOffice; // initialization start office
        this.destinationOffice = destinationOffice; // initialization destination office
    }

    @Override
    public Type getType() {
        return this.type;
    }
    // override method get type delivery
    @Override
    public PostOffice getStartPostOffice() {
        return this.startOffice;
    }
    // override method get start office
    @Override
    public PostOffice getDestinationPostOffice() {
        return this.destinationOffice;
    }
    // override method get destination post office
}
