<%-- 
    Document   : right_panel
    Created on : Apr 13, 2026, 4:00:57 PM
    Author     : ok797738
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="right_panel">
    <div class="suggestion_container">
        <h4>Suggestion for you</h4>
        <c:forEach var="users" items="${SuggestedUsersHashMap}">
            <li>
                <a href="${pageContext.request.contextPath}/Member?action=load_other_profile&userID=${users.value.getUserID()}">
                    <div class="user_avatar"></div>
                    <span>${users.value.getUsername()}</span>
                </a>
                <form action="${pageContext.request.contextPath}/Friends" method="post">
                    <input type="hidden" name="action" value="followUser">
                    <input type="hidden" name="followingID" value="${loadedProfileUserID}">
                    <button type="submit" ><img src="${pageContext.request.contextPath}/img/add-user.svg" alt="alt"/></button>
                </form>
            </li>
        </c:forEach>
    </div>
</div>