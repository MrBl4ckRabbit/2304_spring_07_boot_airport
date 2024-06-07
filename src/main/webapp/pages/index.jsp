<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
  <title>Index</title>
  <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
   <h1>Airplanes:</h1>
   <table border="1">
     <tr>
       <th class="red">Model</th>
       <th>Places</th>
       <th>Actions</th>
     </tr>
       <c:forEach var="airplane" items="${airplanes}">
       <tr>
        <td>${airplane.model}</td>
        <td>${airplane.places}</td>
        <td>
          <a href="/view?plane=${airplane.id}">View</a>

        </td>
       </tr>
       </c:forEach>
     </table>
</body>
</html>