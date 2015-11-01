package com.logistic.impl.model.person;

/**
 *
 */
public class Address implements com.logistic.api.model.person.Address {     // address implements logistic
    private String street;                                                  // street receiver
    private String city;                                                    // city receiver
    private String country;                                                 // country receiver
    private int code;

    public Address(String street, String city, String country, int code) {  // constructor receiver
        this.street = street;                                               // only string street
        this.city = city;                                                   // only string city
        this.country = country;                                             // only string country
        this.code = code;                                                   // only int code
    }

    @Override
    public String getStreet() {
        return this.street;
    }                       // override method get street, made connect
                                                                            // witch private variable street
    @Override
    public String getCity() {
        return this.city;
    }                           // override method get city, made connect
                                                                            // witch private variable city
    @Override
    public String getCountry() {
        return this.country;
    }                     // override method get country, made connect
                                                                            // witch private variable country
    @Override
    public int getCode() {
        return this.code;
    }                              // override method get code, made connect
                                                                            // witch private variable code
    @Override
    public String toString() {
        return "[" + country + " " + city + " " + street + "]";
    } // override to string

    public boolean equals(Object o) {                                       // equals
        if(o == null) return false;                                         // if object equals zero return false
        if(!(o instanceof Address)) return false;                           // if don't equals zero address return false

        Address a = (Address) o;                                            // result address to have variable
        return street.equalsIgnoreCase(a.street) &&                         // return street equals ignore case street and
                city.equalsIgnoreCase(a.city) &&                            // city equals ignore case country and
                country.equalsIgnoreCase(a.country) &&                      // country equals ignore case country and
                code == a.code;                                             // code to same object "a"
    }
}
