<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Update Passenger Page</title>
</head>
<body>
 <p>
   You try to change passenger: ${passenger.fio}<br>
   You can only change a place!!!
 </p>
  <form method="post" action="/savePassenger">
    <input name="passengerId" type="hidden" value="${passenger.id}">
    <input name="fio" type="hidden" value="${passenger.fio}">
    <input name="place"  value="${passenger.place}"><br>
    <input name="flightId" type="hidden" value="${passenger.flight.id}">
    <input type="submit" value="Update Passenger">
    </form>
</body>
</html>