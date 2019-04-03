<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息页面</title>
</head>
<body>
<h3>用户列表</h3>
<table border="1" style="border-collapse: collapse;width:800px">
	<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>密码</th>
		<th>邮箱</th>
		<th>电话</th>
		<th>生日</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${users}" var="user">
		<tr>
		<td>${user.id}</td>
		<td>${user.username}</td>
		<td>${user.password}</td>
		<td>${user.email}</td>
		<td>${user.phone}</td>
		<td>
			<fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/>
		</td>
		<td>
			<a href="${pageContext.request.contextPath}/user/delete.do?id=${user.id}">删除</a>&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath}/user/userEdit.do?id=${user.id}">修改</a>
		</td>
	</tr>
	</c:forEach>
</table>
<a href="${pageContext.request.contextPath}/user/userEdit.do">新增用户</a>
<br><br>
<hr>
<h3>部门列表</h3>
<table border="1" style="border-collapse: collapse;width:500px">
	<tr>
		<th>编号</th>
		<th>部门名称</th>
		<th>负责人</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${depts}" var="dept">
	<tr>
		<td>${dept.id}</td>
		<td>${dept.name}</td>
		<td>${dept.manager}</td>
		<td>
			<a href="${pageContext.request.contextPath}/user/deleteDept.do?id=${dept.id}">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath}/user/deptEdit.do?id=${dept.id}">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
		</td>
	</tr>
	</c:forEach>
</table>
<a href="${pageContext.request.contextPath}/user/deptEdit.do">新增部门</a>
</body>
</html>