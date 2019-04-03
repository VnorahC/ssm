<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>处理界面</title>
</head>
<form action="${pageContext.request.contextPath}/user/insertOrupdate.do" method="post">
<input type="hidden" name="id" value="${dept.id}">
<table border="1" style="border-colapes: collapse;width:700px">
	<tr>
		<th>部门名称:</th>
		<td><input type="text" name="name" value="${dept.name}"></td>
	</tr>
	<tr>
		<th>管理者:</th>
		<td><input type="text" name="manager" value="${dept.manager}"></td>
	</tr>
	<tr>
		<td colspan="2">
			<button type="submit">提交</button>
		</td>
	</tr>
</table>
</form>
</html>