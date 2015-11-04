package com.logistic.api.model.person.impl;

import com.logistic.api.model.person.Address;

/**
 * Created by Oleg on 03.11.2015.
 */
public abstract class AddressClass implements Address {

    Address address = new Address() {
        @Override
        public String getStreet() {
            return this.getStreet();
        }

        @Override
        public String getCity() {
            return this.getCity();
        }

        @Override
        public String getCountry() {
            return this.getCountry();
        }

        @Override
        public int getCode() {
            return this.getCode();
        }

    };
    String getcity = address.getCity();
    String getStreet = address.getStreet();
    String getCountry = address.getCountry();
    int getCode = address.getCode();

}


