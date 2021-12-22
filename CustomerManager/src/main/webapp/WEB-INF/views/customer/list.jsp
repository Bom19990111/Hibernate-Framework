
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Danh sách khách hàng</title>
</head>
<%@ page isELIgnored="false"%>
<body>
	<h1>Khách hàng</h1>
	<p>
		<a href="/CustomerManager/new">Thêm mới</a>
	</p>
	<p>Tổng số khách hàng: ${customers.size()}</p>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Tên</td>
			<td>Tuổi</td>
			<td>Địa chỉ</td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td>${customer.getId()}</td>
				<td><a href="view?id=${customer.getId()}">
						${customer.getName()}</a></td>
				<td>${customer.getAge()}</td>
				<td>${customer.getAddress()}</td>
				<td><a href="edit?id=${customer.getId()}">Cập nhật</td>
				<td><a href="remove?id=${customer.getId()}">Xóa</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
