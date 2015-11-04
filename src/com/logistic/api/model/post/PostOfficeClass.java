package com.logistic.api.model.post;

import com.logistic.api.model.person.Address;

import java.awt.*;

/**
 * Created by Oleg on 03.11.2015.
 */
public class PostOfficeClass implements PostOffice {
    @Override
    public Stamp getStamp() {
        return null;
    }

    @Override
    public Address getAddress() {
        return null;
    }

    @Override
    public Package.Type getAcceptableTypes() {
        return null;
    }

    @Override
    public int getMaxWeight() {
        return 0;
    }

    @Override
    public boolean sendPackage(Package parcel) {
        return false;
    }

    @Override
    public boolean receivePackage(Package parcel) {
        return false;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public Point getGeolocation() {
        return null;
    }
}
