package com.logistic.api.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Denis on 5/25/2015.
 */
public class Storage {                                                                 // class for storage
    private Map storage;                                                               // map storage

    private static class InstanceHolder {                                              // instance holder storage
        private static final Storage instance = new Storage();                         // grete new instance storage
    }

    public static Storage getInstance() {
        return InstanceHolder.instance;
    }            // get instance storage

    private Storage() {
        this.storage = new HashMap<>();
    }                              // grete new Hash Map storage

    public void putToStorage(Object id, Object value) {
        this.storage.put(id, value);
    } // put to storage return value id

    public <T> T getById(Object id) throws ClassCastException{                         // get by Id throw cast exception
        return (T) this.storage.get(id);                                               // return get storage Id
    }
}
