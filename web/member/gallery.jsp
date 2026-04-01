<%-- 
    Document   : gallery
    Created on : Mar 25, 2026, 3:50:22 PM
    Author     : ok797738
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/global.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/member/member.css" />
</head>
<div>
    <div>
        <c:forEach var="image" items="${gallery}">                     
            <img src="${image}"/>
        </c:forEach>
    </div>
    <form method="post" action="${pageContext.request.contextPath}/Member" enctype='multipart/form-data'>
        <input  type="hidden" name="action" value="uploadGalleryPhoto"/>
        <input type="file" name="file" />
        <input type="submit" value="upload" class="button_primary"/>
    </form>

</div>