package com.seyed.checkin.controller;

import com.seyed.checkin.integration.ReservationRestfulClient;
import com.seyed.checkin.integration.dto.Reservation;
import com.seyed.checkin.integration.dto.ReservationUpdateRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@Controller
public class ReservationController {

    private final ReservationRestfulClient reservationRestfulClient;
    ReservationController(ReservationRestfulClient reservationRestfulClient){
        this.reservationRestfulClient = reservationRestfulClient;
    }//constructor based injection

    @RequestMapping("/startCheckIn")
    public String startCheckIn(){
        return "startCheckIn";
    }


@RequestMapping("/proceedCheckIn")
public String proceedCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {

    Reservation allReservationData = reservationRestfulClient.findReservation(id);
    if (allReservationData!=null) {
            modelMap.addAttribute("allReservationData", allReservationData);
            return "displayReservation";
    } else {
            modelMap.addAttribute("error", "Enter Valid Id.....");
            return "errorPage";
        }
//    allReservationData.getAllData();//this will call the getAllData() from dto class and will get all data displayed on console
    }
    @RequestMapping("/checkInConfirmation")
    public String checkInConfirmation(
            @RequestParam("id") Long id,
            @RequestParam("numberOfBags") Integer numberOfBags,
            @RequestParam("checkedIn") Boolean checkedIn)
    {
        ReservationUpdateRequest request = new ReservationUpdateRequest();
        request.setId(id);
        request.setNumberOfBags(numberOfBags);
        request.setCheckedIn(checkedIn);
        reservationRestfulClient.updateReservation(request);
        return  "confirmation";
    }
}