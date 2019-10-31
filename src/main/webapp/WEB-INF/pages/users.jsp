<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>

<%@ page session="false" %>

<html>

<head>
    <title>Login page</title>
    <style><%@include file="/WEB-INF/pages/css/style.css"%></style>
</head>
<body>

<link href="css/style.css" rel="stylesheet" type="text/css">

<h2>Hello World!</h2>
<br/>


<div class="left">
    <form method="post" action="" modelAttribute="user">
        <label><input type="text" name="name"></label>
        <br>
        <label><input type="number" name="id"></label>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <input type="submit" value="register"><br>

    </form>





    <form  method="POST" action="${contextPath}/perform_logout">
        <input type="submit" value="logoutsubmit">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>


<br>


    ${currentUser}

    <br/>
    <table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered">
        <thead>
        <tr>
            <th>Id</th>
            <th> name</th>
        </tr>

        </thead>
        <tbody>

        <c:forEach var="i" items="${userlast}">
            <tr>
                <td><c:out value="${i.id}"/></td>

                <td><c:out value="${i.name}"/></td>

            </tr>

        </c:forEach>

        </tbody>
    </table>

    <br/>
    <br/>

    ${name}

    <a href="sessionUser">sessionUser</a>
</div>

<div class="center">
</div>
<div class="right"></div>


</body>




</html>
