package com.logistic.impl.model.post;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;
import com.logistic.api.model.person.Person;
import com.logistic.api.model.post.Stamp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 */
public class Package implements com.logistic.api.model.post.Package {           // package implements com.logistic
    private String id;                                                          // Id package
    private int weight;                                                         // weight package
    private Type type;                                                          // type package
    private Person receiver;                                                    // person receiver
    private Person sender;                                                      // person sender
    private List<Stamp> stamps;                                                 // list stamps

    public Package(int weight, Type type, Person receiver, Person sender) {     // constructor package witch same value
        this.stamps = new ArrayList<>();                                        // grete new array list witch stamps
        this.id = UUID.randomUUID().toString();                                 // initialization id random method
        this.weight = weight;                                                   // initialization weight package
        this.type = type;                                                       // initialization type package
        this.receiver = receiver;                                               // initialization receiver package
        this.sender = sender;                                                   // initialization sender package
    }

    @Override
    public String getPackageId() {
        return this.id;
    }                            // override method get package id

    @Override
    public int getWeight() {
        return this.weight;
    }                              // override method get weight package

    @Override
    public Type getType() {
        return this.type;
    }                                 // override method get type package

    @Override
    public Address getReceiverAddress() {
        return this.receiver.getAddress();
    }  // override method get receiver address

    @Override
    public Address getSenderAddress() {
        return this.sender.getAddress();
    }      // override method get sender address

    @Override
    public FullName getSenderFullName() {
        return this.sender.getFullName();
    }   // override method get sender full name

    @Override
    public FullName getReceiverFullName() {                                     // override method get full name
        return this.receiver.getFullName();
    }

    @Override
    public List<Stamp> getStamps() {
        return this.stamps;
    }                      // override method get stamps

    @Override
    public String toString() {                                                  // override sout
        return "Package " + type + " {" + id + "} weight {" + weight + "} from {" + sender + "} to {" + receiver + "}";
    }
}
