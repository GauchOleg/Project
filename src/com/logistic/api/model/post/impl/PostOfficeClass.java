package com.logistic.api.model.post.impl;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;
import com.logistic.api.model.post.PostOffice;
import com.logistic.api.model.post.Stamp;
import com.logistic.impl.model.post.*;

import java.awt.*;

/**
 * Created by Oleg on 03.11.2015.
 */
public abstract class PostOfficeClass implements PostOffice {
   PostOffice postOffice = new PostOffice() {
       @Override
       public Stamp getStamp() {
           return this.getStamp();
       }

       @Override
       public Address getAddress() {
           return this.getAddress();
       }

       @Override
       public Package.Type getAcceptableTypes() {
           return this.getAcceptableTypes();
       }

       @Override
       public int getMaxWeight() {
           return this.getMaxWeight();
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
           return this.getCode();
       }

       @Override
       public Point getGeolocation() {
           return this.getGeolocation();
       }
   };

    Stamp stamp = postOffice.getStamp();
    Address address = postOffice.getAddress();
    Package.Type packageTypy = postOffice.getAcceptableTypes();
    int getMaxWeight = postOffice.getMaxWeight();
    boolean sendPackage = postOffice.sendPackage();
    boolean receivePackage = postOffice.receivePackage();
    int getCode = postOffice.getCode();
    Point getGeolocation = postOffice.getGeolocation();
}
