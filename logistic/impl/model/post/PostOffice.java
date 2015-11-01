package com.logistic.impl.model.post;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;
import com.logistic.api.model.post.Stamp;

import java.awt.*;
import java.util.Date;

/**
 *
 */
public class PostOffice implements com.logistic.api.model.post.PostOffice { // post office implement logistic
    private Address address; // initialization address
    private Package.Type acceptableType; // to set acceptable type
    private int maxWeight; // initialization max weight package
    private Point coordinates; // initialization point coordinates

    public PostOffice(Address address, Package.Type acceptableType, int maxWeight, Point coordinates) { // constructor
        this.address = address; // initialization address
        this.acceptableType = acceptableType; // initialization acceptable type
        this.maxWeight = maxWeight; // initialization max weight package
        this.coordinates = coordinates; // initialization coordinates package
    }

    @Override
    public Stamp getStamp() {
        return new com.logistic.impl.model.post.Stamp(this.address, new Date());
    }
    // override method get stamp
    @Override
    public Address getAddress() {
        return this.address;
    }
    // override method get address
    @Override
    public Package.Type getAcceptableTypes() {
        return this.acceptableType;
    }
    // override method get acceptable type
    @Override
    public int getMaxWeight() {
        return this.maxWeight;
    }
    // override method get max weight package
    @Override
    public boolean sendPackage(Package parcel) {
        return !parcel.getReceiverAddress().equals(address);
    }
    // override method send package
    @Override
    public boolean receivePackage(Package parcel) {
        //не самый лучший вариант, поскольку getStamps может возвращать немодифицируемую коллекция
        //лучше добавить в интерфейс метод для добавления штампа
        parcel.getStamps().add(getStamp());
        return true;
    }

    @Override
    public int getCode() {
        return this.address.getCode();
    }
    // override method get code
    @Override
    public Point getGeolocation() {
        return this.coordinates;
    }
    // override method get geolocation
    @Override
    public String toString() {
        return "Office " + this.address.getCode() + " ["+ this.address + "] on {" + this.coordinates + "}";
    } // override method sout
}
