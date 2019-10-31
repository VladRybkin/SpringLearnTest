<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 13.01.2019
  Time: 1:06
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
<br>
${currentUser}
<br>
<form  method="POST" action="${contextPath}/perform_logout">
    <input type="submit" value="logout">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
<br>


<form  method="post" action="">
    <label><input type="text" name="stringParam"></label><id /><br>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input type="submit" value="register"><br>
</form>

<br/>
<br/>
${name}
<c:out value="${requestAttribute1}"/>

<h1>listuser</h1>
<br/>
${userlast}
<br>
<a href="users">Users</a>
<br/>

<form method="post" action="">
    <label><input type="number" name="userId"></label><id /><br>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input type="submit" value="remove"><br>
</form>

</body>



</html>
