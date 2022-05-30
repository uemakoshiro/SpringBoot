<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トップ画面</title>
</head>
<body>
  <h1>検索条件または登録情報を入力してください</h1>
  <p>${ msg }</p>
  <form:form action="result" modelAttribute="index" method="post">
    <div>
      <label>product_name:</label> <form:input path="productName" /><br>
      <label>price:</label> <form:input path="price" />
    </div>
    <form:button name="search">検索</form:button>
    <form:button name="register">登録</form:button>
  </form:form>
</body>
