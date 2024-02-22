package com.seyed.checkin.integration;

import com.seyed.checkin.integration.dto.Reservation;
import com.seyed.checkin.integration.dto.ReservationUpdateRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReservationRestfulClientImpl implements  ReservationRestfulClient {
    RestTemplate restTemplate = new RestTemplate();
    @Override
    public Reservation findReservation(Long id) {
        Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/" + id, Reservation.class);
        //from the url we get json object, but we need to work with java obj, thus in the next parameter we supplied class
        // and the json will be mapped to contents of Reservation class. Reservation class contains fields to hold json data
        return reservation;
    }

    @Override
    public Reservation updateReservation(ReservationUpdateRequest reservationUpdateRequest) {
        Reservation updateReservationData = restTemplate.postForObject("http://localhost:8080/flights/reservation", reservationUpdateRequest, Reservation.class);
        return updateReservationData;
    }

}