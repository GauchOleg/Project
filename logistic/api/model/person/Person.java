package com.logistic.api.model.person;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;

/**
 * Created by Denis on 5/25/2015.
 */
public interface Person {
    public Address getAddress();     // get address sender
    public FullName getFullName();   // get Full name sender
}
