<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>处理界面</title>
</head>
<form action="${pageContext.request.contextPath}/user/saveOrupdate.do" method="post">
<input type="hidden" name="id" value="${user.id}">
<table border="1" style="border-colapes: collapse;width:700px">
	<tr>
		<th>姓名:</th>
		<td><input type="text" name="username" value="${user.username}"></td>
	</tr>
	<tr>
		<th>密码:</th>
		<td><input type="text" name="password" value="${user.password}"></td>
	</tr>
	<tr>
		<th>邮箱:</th>
		<td><input type="text" name="email" value="${user.email}"></td>
	</tr>
	<tr>
		<th>电话:</th>
		<td><input type="text" name="phone" value="${user.phone}"></td>
	</tr>
	<tr>
		<th>生日:</th>
		<td><input  name="birthday" value="<fmt:formatDate value="${user.birthday}"/>"></td>
	</tr>
	<tr>
		<td colspan="2">
			<button type="submit">提交</button>
		</td>
	</tr>
</table>
</form>
</html>