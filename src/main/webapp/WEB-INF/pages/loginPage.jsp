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
<form  method="post" action="" modelAttribute="LoginUser" >
    <label><input type="text" name="name"></label><id /><br>
    <label><input type="number" name="id"></label><id /><br>

    <input type="submit" value="register">

</form>

<br>

${loginU}
${loginU2}

</body>
</html>
