package com.seyed.checkin.integration.dto;

import lombok.Data;

@Data
public class Passenger {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private Long phone;
}
