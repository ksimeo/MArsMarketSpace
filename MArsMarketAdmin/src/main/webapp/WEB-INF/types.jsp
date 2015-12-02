<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
<head>
  <title>Редактирование списка типов товаров - MArsMarket</title>
</head>
<script type="text/javascript">
  function createType() {
    document.location="/newtype.do";
  }
  function cancel() {
    document.location="/admin.do";
  }
</script>
<body>
<h4>Вы находитесь на странице редактирования списка типов продуктов, группы "${groupname}" </h4>
<table>
  <thead>
  <tr>
    <th>#</th>
    <th>Название</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="item" items="${types}">
    <tr>
      <td>${item.id}</td>
      <td>${item.name}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<input type="button" value="Создать новый тип товаров" onclick="createType()">
<input type="button" value="Отмена" onclick="cancel()">
</body>
</html>