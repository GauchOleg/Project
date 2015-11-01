package com.logistic.impl.model.transport;

import com.logistic.api.model.post.PostOffice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class Transit implements com.logistic.api.model.transport.Transit { // class transit implements logistic
    private final List<PostOffice> offices; // initialization list post office
    private final double price; // initialization price

    public Transit(List<PostOffice> offices, double price) { // constructor transit with value office and price
        this.price = price; // initialization price
        this.offices = Collections.unmodifiableList(new ArrayList(offices)); // initialization office grete new array list
    }                                                                        // for office

    @Override
    public List<PostOffice> getTransitOffices() {
        return this.offices;
    }
    // override method get transit office
    @Override
    public double getPrice() {
        return price;
    }
    // override method get price
    @Override
    public String toString() {
        return "Transit {" + price + "}" + this.offices;
    }
    // override method sout
}
