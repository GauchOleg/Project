package com.logistic.api.model.transport;

import com.logistic.api.model.post.PostOffice;

/**
 * Created by Denis on 5/25/2015.
 */
public interface DeliveryTransport {
    public Type getType();                                      // Get type delivery
    public PostOffice getStartPostOffice();                     // Get start office
    public PostOffice getDestinationPostOffice();               // Get distance post office (how many mails)

    public static enum Type {                                   // constant type delivery
        SEA(10, 2.5), AIR(50, 25.2), LAND(18, 1.26);            // type delivery

        private int speed;                                      // speed delivery
        private double costPerMile;                             // cost mile

        private Type(int speed, double costPerMile) {           // constructor type speed only int, cost mile only
            this.speed = speed;                                 // double value
            this.costPerMile = costPerMile;
        }

        public int getSpeed() {
            return speed;
        }                 // get speed, return speed only int value

        public double getCostPerMile() {
            return costPerMile;
        }  // get cost mile, return cost mile only double value
    }
}
