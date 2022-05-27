<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>

  <form:form action="menu" modelAttribute="test">
    ログインID：<form:input path="id" /><br>
    パスワード：<form:password path="pass" /><br>
    <form:button>送信</form:button>
  </form:form>
  <a href="input">戻る</a>
  	
</body>
</html>
