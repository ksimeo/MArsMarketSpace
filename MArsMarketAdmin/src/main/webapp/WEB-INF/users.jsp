<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
<head>
    <title>Редактирование списка пользователей системы - MArsMarket</title>
</head>
<script type="text/javascript">
  function editButton(id) {
    document.location="/edit" + id;
  }
</script>
<body>
<table>
  <thead>
  <tr>
    <th>#</th>
    <th>Логин</th>
    <th>Имя</th>
    <th>Фамилия</th>
    <th>Статус администратора</th>
    <th>    </th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <c:forEach var="item" items="${users}">
      <form>
        <td>${item.id}</td>
        <td>${item.login}</td>
        <td>${item.name}</td>
        <td>${item.surname}</td>
        <td>${item.isAdmin}</td>
        <td><input type="submit" value="Удалить"></td>
        <td><input type="button" onclick="editButton(${item.id})"></td>
      </form>
    </c:forEach>
  </tr>
  </tbody>
</table>
</body>
</html>