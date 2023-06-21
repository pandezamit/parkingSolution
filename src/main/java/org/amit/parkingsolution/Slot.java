package org.amit.parkingsolution;

import java.util.*;

public class Slot {

    private boolean isEmpty;

    public Slot() {

    }

    List<Vehicle> small = new ArrayList<Vehicle>();

    List<Vehicle> medium = new ArrayList<Vehicle>();


    List<Vehicle> large = new ArrayList<Vehicle>();


    public boolean isEmpty(Vehicle vehicleType) {
        if (isEmpty == true) return true;
        else return false;
    }


    public void reduceSlot(Vehicle vehicleType, Vehicle vehicleNumber) {
        if (vehicleType == "SMALL" && !small.isEmpty()) small.remove(vehicleNumber);

    }


}
