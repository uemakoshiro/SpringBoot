<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><fmt:message key="page.index.title" /></title>
</head>
<body>
  <h1>検索条件または登録情報を入力してください</h1>
  <p>${ msg }</p>
  <form:form action="result" modelAttribute="index" method="post">
    <div>
      <label><fmt:message key="form.lbl.productName" />:</label> <form:input path="productName" /><form:errors path="productName" cssStyle="color: red"/><br>
      <label><fmt:message key="form.lbl.price" />:</label> <form:input path="price" /><form:errors path="price" cssStyle="color: red"/>
    </div>
    <form:button name="search"><fmt:message key="form.lbl.search" /></form:button>
    <form:button name="register"><fmt:message key="form.lbl.register" /></form:button>
  </form:form>
</body>
