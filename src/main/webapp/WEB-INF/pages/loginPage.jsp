<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 09.05.2019
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" modelAttribute="userForm">
    <label><input type="text" name="name" placeholder="Username"></label>
    <id/>
    <br>
    <label><input type="password" name="password" placeholder="Password"></label>
    <id/>
    <br>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input type="submit" value="login">

</form>


<br>

<%--<c:url var="logoutUrl" value="/j_spring_security_logout" />--%>
<%--<form action="${logoutUrl}" id="logout" method="post">--%>
<%--<input type="hidden" name="${_csrf.parameterName}"--%>
<%--value="${_csrf.token}" />--%>
<%--</form>--%>
<%--<a href="#" onclick="document.getElementById('logout').submit();">Logout</a>--%>

${loginU}
${loginU2}

</body>
</html>
