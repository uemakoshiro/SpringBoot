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
		<table border=3>
			<tr>
				<th>product_id</th>
				<th>product_name</th>
				<th>price</th>
			</tr>
			<c:forEach var="pd" items="${product}">
				<tr>
					<td>${fn:escapeXml(pd.productId)}</td>
					<td>${fn:escapeXml(pd.productName)}</td>
					<td>${fn:escapeXml(pd.price)}</td>
				</tr>
			</c:forEach>
	</table>
	</div><br>
	<a href="index">戻る</a>
</body>
</html>