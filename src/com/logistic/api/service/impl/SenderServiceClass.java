package com.logistic.api.service.impl;

import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;
import com.logistic.api.model.transport.Transit;
import com.logistic.api.service.SenderService;

import java.util.List;

/**
 * Created by Oleg on 03.11.2015.
 */
public class SenderServiceClass implements SenderService {
    @Override
    public List<PostOffice> getAllOffices() {
        return null;
    }

    @Override
    public List<Transit> calculatePossibleTransits(com.logistic.api.model.post.Package parcel) {
        return null;
    }

    @Override
    public boolean sendPackage(Package parcel, Transit transit) {
        return false;
    }

    @Override
    public PostOffice getPackageCurrentPosition(String id) {
        return null;
    }

    @Override
    public double getMilesToDestination(String id) {
        return 0;
    }
}
