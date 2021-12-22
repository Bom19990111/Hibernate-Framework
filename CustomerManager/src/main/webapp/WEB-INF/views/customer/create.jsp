<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Thêm mới</title>
<style>
.message {
	color: green;
}
.message1 {
	color: red;
}
</style>
</head>
<%@ page isELIgnored="false"%>
<body>
	<h1>Thêm mới khách hàng</h1>
	<a href="/CustomerManager/customers">Trở về trang chủ</a>
	<p>
		<c:if test="${message != null}">
			<span class="message">${message}</span>
		</c:if>
	</p>
	<form:form action="new" method="post" modelAttribute="customer">
		<fieldset>
			<legend>Nhập thông tin khách hàng</legend>
			<table>
				<tr>
					<td><form:label path="name">Tên:</form:label></td>
					<td><form:input path="name" /></td>
					<td><form:errors path="name" cssClass="message1" /></td>
				</tr>
				<tr>
					<td><form:label path="age">Tuổi:</form:label></td>
					<td><form:input type="number" path="age" /></td>
					<td><form:errors path="age" cssClass="message1" /></td>
				</tr>
				<tr>
					<td><form:label path="address">Địa chỉ:</form:label></td>
					<td><form:input path="address" /></td>
					<td><form:errors path="address" cssClass="message1" /></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button>Thêm mới</form:button></td>
				</tr>
			</table>
		</fieldset>
	</form:form>
</body>
</html>
