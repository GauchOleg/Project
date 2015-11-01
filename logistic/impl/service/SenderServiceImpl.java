package com.logistic.impl.service;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.post.*;
import com.logistic.api.model.post.Package;
import com.logistic.api.model.transport.Transit;
import com.logistic.api.service.SenderService;
import com.logistic.impl.model.exception.PackageNotFound;
import com.logistic.impl.model.exception.TransitNotFound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 */
public class SenderServiceImpl implements SenderService {
    private static final int LOST_THRESHOLD = 80; // initialization threshold
    private static final int LOST_MAX_THRESHOLD = 100; // initialization max threshold

    @Override
    public List<PostOffice> getAllOffices() {
        return StorageHelper.getAllOffices();
    }
    // override method get all offices
    private Transit reverseTransit(Transit transit) { //
        List<PostOffice> reversedOffices = new ArrayList(transit.getTransitOffices()); // grete new array for reverse transit
        Collections.reverse(reversedOffices); // initialization reverse office
        Transit result = new com.logistic.impl.model.transport.Transit(reversedOffices, transit.getPrice()); // transit result
        return result;  // write in new list
    }

    private boolean hasBeenLost() {
        Random random = new Random(); // grete new object class Random
        return LOST_THRESHOLD < random.nextInt(LOST_MAX_THRESHOLD); // next int set in value threshold
    }

    @Override
    //и нам не нужен параметр  PostOffice senderOffice
    public List<Transit> calculatePossibleTransits(com.logistic.api.model.post.Package parcel) { // calculate possible transit
        List<Transit> result = new ArrayList<>(); // grete new array list for transit
        for(Transit transit : StorageHelper.getTransits()) { // write in array transit
            List<PostOffice> transitOffices = transit.getTransitOffices(); // list post office to have value transit office
            int maxWeightLimit = Integer.MAX_VALUE; // initialization max weight package
            for(PostOffice office : transitOffices) { // change post office when will be transit office
                if(maxWeightLimit > office.getMaxWeight()) { // set acceptable office
                    maxWeightLimit = office.getMaxWeight(); // get max weight office
                }
                //тут можно проверять office.getAcceptableTypes() == parcel.getType()
            }
            if((transitOffices.get(transitOffices.size() - 1).getAddress().equals(parcel.getReceiverAddress()) &&
                    transitOffices.get(0).getAddress().equals(parcel.getSenderAddress())) &&
                    maxWeightLimit >= parcel.getWeight()) {
                result.add(transit);
                // equals transit office witch address office and max weight package and sender address
            }
            if((transitOffices.get(0).getAddress().equals(parcel.getReceiverAddress()) &&
                    transitOffices.get(transitOffices.size() - 1).getAddress().equals(parcel.getSenderAddress())) &&
                    maxWeightLimit >= parcel.getWeight()) {
                result.add(reverseTransit(transit));
                // equals transit office witch address office and max weight package and sender address
            }
        }
        return result;
    }

    @Override
    public boolean sendPackage(Package parcel, Transit transit) { // override method send package
        if(parcel == null) throw new PackageNotFound(); // if package equals null throw exception package not found
        if(transit == null) throw new TransitNotFound(); // if transit equals naull throw exception transit not found
        StorageHelper.saveParcelTransit(parcel, transit); // constructor storage helper
        if(transit.getTransitOffices().size() == 0) { // if get transit office size equals zero
            return false; // return false
        }
        boolean send = true;
        for(PostOffice office : transit.getTransitOffices()) { // post office compare get transit office
            office.receivePackage(parcel); // office receive package
            if(hasBeenLost()) { // if has been lost
                System.out.println("Package has been lost");
                return true;
            }
            //тут можно подкрутить отсылку так чтобы полылка не всегда доходила до точки назначения
            send = office.sendPackage(parcel);
            if(!send) { // if don't send
                System.out.println("Package has been rich destination place");
                break;
            }
        }
        return send;
    }

    @Override
    public PostOffice getPackageCurrentPosition(String id) { // override method get package current position
        Package parcel = StorageHelper.getPackage(id); // get package Id storage helper
        Transit transit = StorageHelper.getTransit(id); // gat transit Id
        if(parcel == null) { // if parcel equal null
            throw new PackageNotFound(); // throw new exception package not found
        }
        if(transit == null) { // if transit equal null
            throw new TransitNotFound(); // throw new exception transit not found
        }

        List<Stamp> stamps = parcel.getStamps(); // write value in list stamp get stamps
        Address lastOfficeAddress = stamps.get(stamps.size() - 1).getPostOfficeAddress(); // get stamps and assigned address
        for(PostOffice office : transit.getTransitOffices()) { // post office compare get transit office
            if(lastOfficeAddress.equals(office.getAddress())) { // if last office equals office get address
                return office; // return
            }
        }

        return null;
    }

    @Override
    public double getMilesToDestination(String id) { // override method get miles to destination
        PostOffice currentOffice = getPackageCurrentPosition(id); // post office current office get package current position
        Package parcel = StorageHelper.getPackage(id); // package parcel assigned get package Id
        if(currentOffice.getAddress().equals(parcel.getReceiverAddress())) { // if current office address equal receiver address
            return 0;
        }
        Transit transit = StorageHelper.getTransit(id); // Transit assigned storage helper transit Id
        boolean isOnTheWay = false; // initialization is on the way
        int miles = 0; // initialization miles
        PostOffice previousOffice = null; // initialization post office previous office
        for(PostOffice office : transit.getTransitOffices()) { // then post office office get transit office
            if(isOnTheWay) {
                miles += office.getGeolocation().distance(previousOffice.getGeolocation()); // miles plus and assigned value distance
            }

            if(currentOffice.getAddress().equals(office.getAddress())) { // get current address equal office gat address
                isOnTheWay = true;
            }
            previousOffice = office;
        }
        return miles;
    }
}
