package com.seyed.checkin.integration;

import com.seyed.checkin.integration.dto.Reservation;
import com.seyed.checkin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {
    public Reservation findReservation(Long id);
    public Reservation updateReservation(ReservationUpdateRequest reservationUpdateRequest);
}
