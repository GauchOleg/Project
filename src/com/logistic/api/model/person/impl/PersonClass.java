package com.logistic.api.model.person.impl;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;
import com.logistic.api.model.person.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Oleg on 03.11.2015.
 */
public abstract class PersonClass implements Person {
    Person person = new Person() {
        @Override
        public Address getAddress() {
            return this.getAddress();
        }

        @Override
        public FullName getFullName() {
            return this.getFullName();
        }
    };



}

