<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果画面</title>
</head>
<body>
	<h1>検索結果</h1>
	<p>データを取得しました</p>
	<div>
	product_id:${fn:escapeXml(product.productId)}<br>
	product_name:${fn:escapeXml(product.productName)}<br>
	price:${fn:escapeXml(product.price)}<br>
	</div><br>
	<a href="index">戻る</a>
</body>
</html>