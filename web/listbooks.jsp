<%-- 
    Document   : listbooks
    Created on : Jan 19, 2023, 10:30:37 AM
    Author     : pupil
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>spisok knig</title>
    </head>
    <body>
        <h1>spisok knig</h1>
        <c:forEach var="book" items="${books}">
            <p>${book.name}</p>
            <p> Authors: 
                <c:forEach var="author" items="${book.authors}">
                <p>${author.firstname} ${author.lastname}</p>
                </c:forEach>
            </p>
            <p>
                god izdaniya: ${book.publishedYear}
            </p>
            <p>koli4estvo ekzemplyarov : ${book.quantity}</p>
            <p>koli4estvo v nali4ii: ${book.count}</p>
            <p>------------------------------------------</p>
                
        </c:forEach> 
    </body>
</html>
