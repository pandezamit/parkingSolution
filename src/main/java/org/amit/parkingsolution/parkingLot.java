package org.amit.parkingsolution;

//import sun.security.krb5.internal.Ticket;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class parkingLot {


    public <Slot> Ticket vehicleEntry(Vehicle vehicleNumber, Vehicle vehicleType){

        LocalDateTime timeNow = LocalDateTime.now();
        UUID uuid = UUID.randomUUID();

    //    Slot slot= new Slot();
    //    slot.equals(vehicleType);


        Ticket ticket = new Ticket();
        return ticket.generateTicket(uuid, vehicleNumber, timeNow);
    }


}
