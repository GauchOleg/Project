package com.logistic.api.model.post;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;

import java.util.List;
import java.util.Random;

/**
 * Created by Denis on 5/25/2015.
 */
public interface Package {
    public String getPackageId();                  // get package Id
    public int getWeight();                        // get weight package
    public Type getType();                         // get type package
    public Address getReceiverAddress();           // get receiver address
    public Address getSenderAddress();             // get sender address
    public FullName getSenderFullName();           // get sender full name
    public FullName getReceiverFullName();         // get receiver full name
    public List<Stamp> getStamps();                // get post Stamp

    /**
     * http://www.ups.com/worldshiphe
     * lp/WS15/RUS/AppHelp/Codes/Package_Type_Codes.htm
     */
    public static enum Type {                                                       // set type package
        T_CP("Место груза"), T_30("Палета", 50), T_10("Коробка UPS 10 кг", 10),
        T_25("Коробка UPS 25 кг", 25), T_27("Средняя коробка UPS Express");

        private final String description;                                           // description package
        private final int maxWeight;                                                // max weight package

        private Type(String description) {                                          // type description only string
            this(description, 0);
        }

        private Type(String description, int maxWeight) {                           // constructor type
            this.description = description;                                         // only string description
            this.maxWeight = maxWeight;                                             // only int max weight package
        }

        public String getDescription() {
            return description;
        }                      // get description package

        public int getMaxWeight() {
            return maxWeight;
        }                             // get max weight package

        public static Type getRandomType() {                                        // get random type package
            Random r = new Random();                                                // grete new object class "Random"
            return values()[r.nextInt(values().length)];                            // return random value in array
        }
    }
}
