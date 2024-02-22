package com.seyed.checkin.integration.dto;

import lombok.Data;

@Data
public class ReservationUpdateRequest {
    private Long id;
    private int numberOfBags;
    private boolean checkedIn;
}