<%-- 
    Document   : recieve_message
    Created on : Mar 24, 2026, 5:03:19 PM
    Author     : raren
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Received Messages</title>
    </head>
    <body>
        <h1>Received Messages</h1>

        <table>
               <thead>
                    <th>from</th>
                    <th>message</th>
                    <th>date</th>
                </thead>
                <tbody>
                
                <c:forEach var="message" items="${messagesForLoggedInUser}">
                    <tr>
                        <td>${message.value.getSenderID()}</td>
                    </tr>
                </c:forEach>

            </tbody>
        </table> 
        
    </body>
</html>
