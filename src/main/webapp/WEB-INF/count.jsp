<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>You have visited <a href="#">http:localhost:8080</a> <c:out value="${count}"></c:out></h1>
<p><a href="/">Test another visit</a> </p>

</body>
</html>