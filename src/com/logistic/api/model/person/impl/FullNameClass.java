package com.logistic.api.model.person.impl;

import com.logistic.api.model.person.FullName;

/**
 * Created by Oleg on 03.11.2015.
 */
public abstract class FullNameClass implements FullName {

    FullName fullName = new FullName() {
        @Override
        public String getFirstName() {
            return this.getFirstName();
        }

        @Override
        public String getLastName() {
            return this.getLastName();
        }

        @Override
        public String getMiddleName() {
            return this.getMiddleName();
        }
    };
    String getFirstName = fullName.getFirstName();
    String getLastName = fullName.getLastName();
    String getMiddleName = fullName.getMiddleName();
}
