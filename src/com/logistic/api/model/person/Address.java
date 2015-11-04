package com.logistic.api.model.person;

/**
 * Created by Denis on 5/25/2015.
 */
public interface Address {
    public String getStreet();    // get Street name sender
    public String getCity();      // get City name sender
    public String getCountry();   // get Country name sender
    public int getCode();         // get code sent package
}
