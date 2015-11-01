package com.logistic.api.model.post;

import com.logistic.api.model.person.Address;

import java.awt.*;

/**
 * Created by Denis on 5/25/2015.
 */
public interface PostOffice {
    public Stamp getStamp();                        // get stamp office
    public Address getAddress();                    // get address office
    public Package.Type getAcceptableTypes();       // get acceptable type delevery
    public int getMaxWeight();                      // get max weight for office
    public boolean sendPackage(Package parcel);     // Did package sent?
    public boolean receivePackage(Package parcel);  // Did get package receive?
    public int getCode();                           // Get id cod package
    public Point getGeolocation();                  // Get geolocation package
}
