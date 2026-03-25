<%-- 
    Document   : gallery
    Created on : Mar 25, 2026, 3:50:22 PM
    Author     : ok797738
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
        <form method="post" action="${pageContext.request.contextPath}/Member">
            <input  type="hidden" name="action" value="getImageForUser"/>
            <input type="submit" value="get" class="button_primary"/>
        </form>
            
            <div>
                  <c:forEach var="image" items="${gallery}">
                      <p>${image}</p>
                        <img src="${image}"/>
                    </c:forEach>
            </div>
    </body>
</html>
