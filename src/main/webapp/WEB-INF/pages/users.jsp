<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>

<h2>Hello World!</h2>
<br/>


<div class="left">
    <form method="post" action="" modelAttribute="user">
        <label><input type="text" name="name"></label>
        <id/>
        <br>
        <label><input type="number" name="id"></label>
        <id/>
        <br>

        <input type="submit" value="register"><br>

    </form>

    <%--<h1>param1</h1>--%>
    <%--<br/>--%>
    <%--${param1}--%>
    <%--<br/>--%>

    <%--<h1>param</h1>--%>
    <%--<br/>--%>

    <%--${param}--%>
    <%--<br/>--%>

    <%--<h1>user</h1>--%>
    <%--<br/>--%>
    <%--${user}--%>

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


<style>
    .align {
        margin-top: 3px;
    }

    .inner {
        border: 1px solid black;
        height: 120px;
        width: 590px;
        margin-top: 10px;
        margin-left: 70px;
        background: #fafafa;
    }

    .head {

        height: 700px;
    }

    .right {
        float: right;
        width: 25%;
        height: 100%;
        border: 1px solid black;
        background-color: cornflowerblue;

    }

    .left {
        float: left;
        width: 25%;
        height: 99.5%;
        border: 1px solid black;

    }

    .center {
        border: 1px solid black;
        float: left;
        height: 99.5%;
        width: 49.6%;

    }

    .header1 {
        text-align: center;
    }

    #check {
        margin-left: 81px
    }

    #remember {
        margin-left: 0px
    }

    #pass {
        margin-left: 22.5px
    }

    #login {
        margin-left: 30px
    }

    .inner > div {
        margin: 10px;
    }

    header {
        background-color: white;
        text-align: right;
        border: 1px solid #acadac;
    }

    footer {
        background-color: #00FFFF;
        text-align: center;
    }

    .back {
        margin-top: 3px;
        margin-left: 5px;
    }

    red {
        color: red;
    }

    table {
        margin-top: 10px;
        margin-left: 50px;
        border: 1px solid #939694;
    }

    .td {
        width: 407px;
        margin-left: -70px

    }

    .button {
        width: 80px
    }

    #size {
        width: 500px;
    }

    #td {
        margin-left: -335px
    }


</style>

</html>
