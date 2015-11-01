package com.logistic.api.service;

import com.logistic.api.model.post.Package;
import com.logistic.api.model.post.PostOffice;
import com.logistic.api.model.transport.Transit;

import java.util.List;

/**
 * Created by Denis on 5/25/2015.
 */
public interface SenderService {                                     // from sender
    public List<PostOffice> getAllOffices();                         // get any office for sender
    public List<Transit> calculatePossibleTransits(Package parcel);  // calculate possible transit
    public boolean sendPackage(Package parcel, Transit transit);     // send package
    public PostOffice getPackageCurrentPosition(String id);          // get current position package
    public double getMilesToDestination(String id);                  // get miles to destination

}
