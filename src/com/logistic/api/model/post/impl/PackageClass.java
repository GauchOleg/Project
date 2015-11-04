package com.logistic.api.model.post.impl;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;
import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;

import java.util.List;

/**
 * Created by Oleg on 03.11.2015.
 */
public abstract class PackageClass implements Package {
    Package pack = new Package() {
        @Override
        public String getPackageId() {
            return this.getPackageId();
        }

        @Override
        public int getWeight() {
            return this.getWeight();
        }

        @Override
        public Type getType() {
            return this.getType();
        }

        @Override
        public Address getReceiverAddress() {
            return this.getReceiverAddress();
        }

        @Override
        public Address getSenderAddress() {
            return this.getSenderAddress();
        }

        @Override
        public FullName getSenderFullName() {
            return this.getSenderFullName();
        }

        @Override
        public FullName getReceiverFullName() {
            return this.getReceiverFullName();
        }

        @Override
        public List<Stamp> getStamps() {
            return this.getStamps();
        }
    };
    String getPackageId = pack.getPackageId();
    int getWeight = pack.getWeight();
    Type getTipe = pack.getType();
    Address getReceiverAddress = pack.getReceiverAddress();
    Address getSenderAddress = pack.getSenderAddress();
    FullName getReceiverFullName = pack.getReceiverFullName();
    FullName gatSenderFullName = pack.getSenderFullName();
    List<Stamp> getStamp = pack.getStamps();

}
