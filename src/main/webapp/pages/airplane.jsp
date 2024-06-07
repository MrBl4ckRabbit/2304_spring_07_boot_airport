<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
  <title>Airplane</title>
  <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
   <h1>Airplane:</h1>
   <h2>Model: ${airplane.model}</h2>
   <h2>Places: ${airplane.places}</h2>

   <h1>Passengers:</h1>
   <table border="1">
     <tr>
       <th class="red">Fio</th>
       <th>Actions</th>
     </tr>
       <c:forEach var="passenger" items="${airplane.passengers}">
       <tr>
        <td>${passenger.fio}</td>

        <td>


        </td>
       </tr>
       </c:forEach>
     </table>
</body>
</html>