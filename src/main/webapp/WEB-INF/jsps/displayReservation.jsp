<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Flight / Reservation</title>
</head>
<body>
<h2> <u>Reservation Data</u></h2>

<h3>Passenger Details</h3>
    <label> Name: ${StringUtils.join([allReservationData.getPassenger().getFirstName(), allReservationData.getPassenger().getMiddleName(), allReservationData.getPassenger().getLastName()], " ")}</label>
<br><label> Email: ${allReservationData.getPassenger().getEmail()}</label>
<br><label> Phone Number: ${allReservationData.getPassenger().getPhone()}</label>

<h3>Flight Details</h3>
    <label> Operating Airlines: ${allReservationData.getFlight().getOperatingAirlines()}</label>
<br><label> Operating Airlines: ${allReservationData.getFlight().getFlightNumber()}</label>
<br><label> Departure City: ${allReservationData.getFlight().getDepartureCity()}</label>
<br><label> Arrival City: ${allReservationData.getFlight().getArrivalCity()}</label>
<br><label> Date of Departure: ${allReservationData.getFlight().getDateOfDeparture()}</label>
<br><label> Estimated Departure Time: ${allReservationData.getFlight().getEstimatedDepartureTime()}</label>

<h3>Other Details</h3>
<br><label> Checked in Status: ${allReservationData.isCheckedIn() ? "Confirmed" : "Pending"}</label>
<br><label> Quantity of Bags: ${allReservationData.getNumberOfBags()}</label>

<h2>Update customer boarding information</h2>
<form action="checkInConfirmation" method="post">
    <label><input type="text" name="id" value="${allReservationData.id}" hidden></label>
    <br><label>Number of Bags: <input type="text" name="numberOfBags" value="${allReservationData.getNumberOfBags()}" required></label>
    <br><label>CheckIn status:
        <select name="checkedIn" required>
            <option value="true" ${allReservationData.isCheckedIn() ?'selected' : ''}>Confirmed</option>
            <option value="false" ${!allReservationData.isCheckedIn() ?'selected' : ''}>Pending</option>
        </select>
        </label>
    <br><input type="submit" value="Proceed">
</form>
</body>
</html>