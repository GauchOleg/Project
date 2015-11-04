package com.logistic.api.model.post;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;

import java.util.List;

/**
 * Created by Oleg on 03.11.2015.
 */
public class PackageClass implements Package {
    @Override
    public String getPackageId() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public Address getReceiverAddress() {
        return null;
    }

    @Override
    public Address getSenderAddress() {
        return null;
    }

    @Override
    public FullName getSenderFullName() {
        return null;
    }

    @Override
    public FullName getReceiverFullName() {
        return null;
    }

    @Override
    public List<Stamp> getStamps() {
        return null;
    }
}
