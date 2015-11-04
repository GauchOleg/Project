package com.logistic.api.model.transport.impl;

import com.logistic.api.model.post.PostOffice;
import com.logistic.api.model.transport.Transit;

import java.util.List;

/**
 * Created by Oleg on 03.11.2015.
 */
public abstract class TransitClass implements Transit {
    Transit transit = new Transit() {
        @Override
        public List<PostOffice> getTransitOffices() {
            return this.getTransitOffices();
        }

        @Override
        public double getPrice() {
            return this.getPrice();
        }
    };
    List postOffise = transit.getTransitOffices();
    double getPrice = transit.getPrice();
}
