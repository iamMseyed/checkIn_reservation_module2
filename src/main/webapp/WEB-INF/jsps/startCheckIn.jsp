<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Flight / Start CheckIn</title>
</head>
<body>
<h2>Start CheckIn</h2>
<form action="proceedCheckIn" method="POST">
    <label> Enter reservation id <input type="text" name="id" required/></label>
    <br>
    <input type="submit" value="Start"/>
</form>
</body>
</html>