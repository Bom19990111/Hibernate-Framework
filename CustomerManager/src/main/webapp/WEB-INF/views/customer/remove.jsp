<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Cập nhật</title>
<style>
.message {
	color: green;
}
</style>
</head>
<%@ page isELIgnored="false"%>
<body>
	<h1>Xóa khách hàng</h1>
	<a href="/CustomerManager/customers">Trở về trang chủ</a>
	<p>
		<c:if test="${message != null}">
			<span class="message">${message}</span>
		</c:if>
	</p>
	<form:form action="remove" method="post" modelAttribute="customer">
		<fieldset>
			<legend style="color: red;">Bạn có muốn xóa khách hàng này
				không?</legend>
			<table>
				<tr>
					<td><form:hidden path="id" /></td>
				</tr>
				<tr>
					<td><form:label path="name">Tên:</form:label></td>
					<td><form:input path="name" readonly="true" /></td>
				</tr>
				<tr>
					<td><form:label path="age">Tuổi:</form:label></td>
					<td><form:input type="number" path="age" readonly="true" /></td>
				</tr>
				<tr>
					<td><form:label path="address">Địa chỉ:</form:label></td>
					<td><form:input path="address" readonly="true" /></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button>Xóa</form:button></td>
				</tr>
			</table>
		</fieldset>
	</form:form>
</body>
</html>
