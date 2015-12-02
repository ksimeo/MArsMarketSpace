<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Создание нового продукта - MArsMarketSpace</title>
</head>
<script type="text/javascript">
  document.getElementById('tid').onclick = function selectType() {
    document.location="/prodedit.do?pid=" + document.getElementById('pid').value + "&tid=" +
           document.getElementById('tid').value;
  }

  function editType() {
    document.location="/typedit.do";
  }

  function editGroup() {
    document.location="/groupedit.do?tid=" + document.getElementById('tid').value;
  }

  function editProd() {

  }

  function typeSelect() {

  }

  function groupSelect() {

  }

  function pressNewProductButton() {
    document.location = "/newproduct.do?tid=" + document.getElementById('tid') + "&gid=" +
            document.getElementById('gid');
  }

  function cancel() {
    document.location = "/main.do";
  }
</script>
<body>
  <h2>Страница редактирования предлагаемой продукции</h2>
  <h4>Тип продукции:</h4>
  <label>
    <select name="types" id="tid" size="1" onchange="typeSelect()">
      <option value="0">-Выберите тип продукции</option>
      <c:forEach items="${types}" var="item">
        <option name="type" id="${item.id}" value="${item.id}">${item.name}</option>
      </c:forEach>
    </select>
    <input type="button" value="Редактировать список" onclick="editType()">
  </label>
  <hr/>
  <p>
  <h4>Группа товаров:</h4>
  <label>
    <select name="goups" size="1" id="gid" onselect="selectType()" onchange="groupSelect()">
      <option value="0">-Выберите-группу-товаров-</option>
      <c:forEach items="${groups}" var="item">
        <option name="group" id="${item.id}" value="${item.id}">${item.name}</option>
      </c:forEach>
    </select>
    <input type="button" value="Редактировать" onclick="editGroup()">
  </label>
  <hr/>
  <p>
  <h4>Предлагаемые товары:</h4>
  <label>
    <select name="prods" size="5" id="pid" onselect="selectType()">
      <option value="0">-Выберите-группу-товаров-</option>
      <c:forEach items="${products}" var="item">
        <option name="prod" id="${item.id}" value="${item.id}">${item.name}</option>
      </c:forEach>
    </select>
    <input type="button" value="Редактировать" onclick="editProd()">
  </label>
  <hr/>
  <input type="button" value="Добавить продукт" onclick="pressNewProductButton()"/>
  <input type="button" value="Отмена" onclick="cancel()">
</body>
</html>