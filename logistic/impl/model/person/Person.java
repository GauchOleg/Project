package com.logistic.impl.model.person;

import com.logistic.api.model.person.*;
import com.logistic.api.model.person.Address;

/**
 *
 */
public class Person implements com.logistic.api.model.person.Person, FullName {  // class person implements logistic package
    private Address address;                                                     // address receiver
    private String firstName;                                                    // first name receiver
    private String lastName;                                                     // last name receiver
    private String middleName;                                                   // middle name receiver


    @Override
    public String getFirstName() {
        return this.firstName;
    }                      // override method get first name

    @Override
    public String getLastName() {
        return this.lastName;
    }                        // override method get last name

    @Override
    public String getMiddleName() {
        return this.middleName;
    }                    // override method get middle name

    @Override
    public Address getAddress() {
        return this.address;
    }                         // override method get address

    @Override
    public FullName getFullName() {
        return this;
    }                               // override method get full name

    @Override
    public String toString() {
        return "Person [" + firstName + " " + lastName + " " + middleName + "] " + address;
    }

    public static final class PersonBuilder {                                    // initialization person
        private String street;                                                   // only string - street person
        private String city;                                                     // only string - city person
        private String country;                                                  // only string - country person
        private int code;                                                        // only int value - code person
        private String firstName;                                                // only string - first name person
        private String lastName;                                                 // only string - last name person
        private String middleName;                                               // only string - middle name person
        private Address address;                                                 // have constructor address person

        public PersonBuilder address(Address address) {                          // initialization address person
            this.address = address;                                              // address to have variable address
            return this;                                                         // return address
        }
        public PersonBuilder street(String val) {                                // initialization street person
            this.street = val;                                                   // street to have variable val
            return this;                                                         // return val
        }
        public PersonBuilder city(String val) {                                  // initialization city person
            this.city = val;                                                     // city to have variable val
            return this;                                                         // return val
        }
        public PersonBuilder country(String val) {                               // initialization country person
            this.country = val;                                                  // country to have variable val
            return this;                                                         // return val
        }
        public PersonBuilder code(int val) {                                     // initialization code person
            this.code = val;                                                     // code to have variable var
            return this;                                                         // return val
        }
        public PersonBuilder firstName(String val) {                             // initialization first name person
            this.firstName = val;                                                // first name to have variable val
            return this;                                                         // return val
        }
        public PersonBuilder lastName(String val) {                              // initialization last name person
            this.lastName = val;                                                 // last name to have variable val
            return this;                                                         // return val
        }
        public PersonBuilder middleName(String val) {                            // initialization middle name person
            this.middleName = val;                                               // middle name to have variable val
            return this;                                                         // return val
        }
        public Person build() {                                                  // default constructor person
            Address address = null;                                              // initialization address
            if(this.address != null) {                                           // if this address don't to same null
                address = this.address;                                          // address to have this
            } else {
                address = new com.logistic.impl.model.person.Address(street, city, country, code); // else grete new object
            }
            Person person = new Person();                                        // grete new object class person
            person.address = address;                                            // initialization address
            person.firstName = firstName;                                        // initialization first name
            person.lastName = lastName;                                          // initialization last name
            person.middleName = middleName;                                      // initialization middle name
            return person;                                                       // return person
        }
    }
}
