<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<html>
<head>
    <title>Редактирование списка групп товаров - MArsMarket</title>
</head>
<body>
<script type="text/javascript">
  function pressCreateButton() {
    document.location = "/newgroup.do";
  }

  function cancel() {
    document.location = "/main.do";
  }
</script>
<table>
  <thead>
  <tr>
    <td>#</td>
  <td>Наименование группы</td>
  </tr>
  </thead>
  <tbody>
  <tr>
    <c:forEach var="item" items="${groups}">
      <td>${item.id}</td>
      <td>${item.name}</td>
    </c:forEach>
  </tr>
  </tbody>
</table>
<input type="button" value="Создать новую группу" onclick="pressCreateButton()"/>
<input type="button" value="Отмена" >
</body>
</html>
