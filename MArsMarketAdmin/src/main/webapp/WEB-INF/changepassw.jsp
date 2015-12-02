<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Изменение пароля - MArsMarketSpace</title>
</head>
<script type="text/javascript">
  function cancel() {
      document.location ="/main.do";
  }
</script>
<body>
<form action="/savechange.do" method="post">
  <h4>Введите старый пароль:<input type="password" name="oldpassword" required="required"/></h4>
  <hr/>
  <h4>Введите новый пароль:<input type="password" name="newpassword1" required="required"/></h4>
  <br/>
  <h4>Подтвердите новый пароль:<input type="password" name="newpassword2" required="required"/></h4>
  <br/>
  <input type="submit" value="OK"/>&nbsp;<input type="button" value="Отмена" onclick="cancel()"/>
</form>
</body>
</html>
