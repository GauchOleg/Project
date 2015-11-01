package com.logistic.api.model.transport;

import com.logistic.api.model.post.PostOffice;

import java.util.List;

/**
 * Created by Denis on 5/25/2015.
 */
public interface Transit {
    public List<PostOffice> getTransitOffices(); // get transit office (where will be package transit)
    public double getPrice();                    // get price money, only double value
}
