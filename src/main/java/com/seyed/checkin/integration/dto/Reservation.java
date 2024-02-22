package com.seyed.checkin.integration.dto;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.lang.reflect.Field;

@Data
public class Reservation {
    private Long id;
    private boolean checkedIn;
    private Integer numberOfBags;
    private Passenger passenger;
    private Flight flight;
/*
    public void getAllData() throws IllegalAccessException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // Allow access to private fields
            System.out.println(field.getName() + ": " + field.get(this)); //will print in console
        }
    }
    /*
 */
    /*  ==============with the help of REFLECTION API==================

        this method will be like printing all data of this class when accessed outside of this class
        simple illustration to show how this class data can be accessed outside, if necessary to
        show data. else we can simply call getters from this class which we used @Data annotation.
        It is important to note that though we are creating the method to print all data from the class,
        still we need getters and setters in the class. In short this will get data from getters and use
        loop to iterate over.
    */
}