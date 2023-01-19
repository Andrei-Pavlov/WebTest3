<%-- 
    Document   : books
    Created on : Jan 18, 2023, 2:54:40 PM
    Author     : pupil
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Book: ${books.name}</h1>
        <h1> Author: <c:forEach var="author" items="${books.authors}">
            ${author.firstname} ${author.lastname}
            </c:forEach>
        </h1>
        <h1>Quantity: ${books.quantity}</h1>
        <h1>Year: ${books.publishedYear}</h1>
        <h1>Real quantity: ${books.count}</h1>
    </body>
</html>
