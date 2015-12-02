<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>MArsMarketSpace - Администрирование ресурса</title>
</head>
<body>
<form action="login" method="post">
    <h4>Логин: &nbsp; <input type="text" name="login" required="required" value="${login}"></h4>
    <h4>Пароль: &nbsp; <input type="password" name="password" required="required" value="${password}"></h4>
    <p style="color: #f66c6c">
        ${Error}
    </p>
    <input type="submit" value="Войти">
</form>
</body>
</html>