<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Đăng nhập</title>
<style>
.error {
	color: red;
	font-style: italic;
}

.message {
	color: red;
	font-style: italic;
}
</style>
</head>
<%@ page isELIgnored="false"%>
<body>
	<h1>Login</h1>
	<p>
		<c:if test="${message != null}">
			<span class="message">${message}</span>
		</c:if>
	</p>
	<form:form action="login" method="post" modelAttribute="user">
		<fieldset>
			<table>

				<tr>
					<td><form:label path="username">Username:</form:label></td>
					<td><form:input path="username" /></td>
					<td><form:errors path="username" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password:</form:label></td>
					<td><form:password path="password" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button>Login</form:button></td>
				</tr>
			</table>
		</fieldset>
	</form:form>
	<b>Nếu chưa có tài khoản, hãy đăng ký </b>
	<a href="register">Tại đây</a>
</body>
</html>
