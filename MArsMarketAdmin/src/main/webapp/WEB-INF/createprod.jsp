<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Создание нового продукта - MArsMarket</title>
</head>
<body>
<form>
  <input type="hidden" name="gid"/>
  <input type="hidden" name="tid"/>
  <h2>Для создания нового продукта, пожалуйста,<br/>
    заполните все поля ниже:</h2>
  <br/>
  <h4>Название продукта:<input type="text" name="productname"/></h4>
  <br/>
  <h4>Модель:<input type="text" name="productmodel"></h4>
  <br/>
  <h4>Производитель:<input type="text" name="producer"></h4>
  <br/>
  <h4>Страна-производитель:<input type="text" name="country"/></h4>
  <br/>
  <h4>Описание:</h4>
  <textarea raw="10" cols="10"></textarea>
  <br/>
  <h3>Цена:<input type="text" name="price"></h3>
  </br>
  <input type="submit" value="Создать"/>&nbsp;<input type="button" value="Отмена" onclick="cancel()">
</form>
</body>
</html>