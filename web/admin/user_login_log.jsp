<%-- 
    Document   : user_login_log
    Created on : Mar 30, 2026, 3:48:26 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach items="${loginMap}" var="log">
            <tr>
                <td>{log.value} {log.value.logged_action_ID}</td>
            </tr>
        </c:forEach>
    </body>
</html>
