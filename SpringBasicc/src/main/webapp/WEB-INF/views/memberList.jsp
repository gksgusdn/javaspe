<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<title>멤버목록</title>
</head>
<body>
	<h1>멤버목록</h1>
	<table>
		<thead>
			<th>아이디</th>
			<th>이름</th>
		</thead>
<c:forEach items="${list }" var="vo">
	<tr>
		<td>${vo.user_id}</td>
		<td>${vo.user_name}</td>
	</tr>
</c:forEach>
	</table>
</body>
</html>
