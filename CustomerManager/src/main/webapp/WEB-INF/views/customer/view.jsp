
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Chi tiết khách hàng</title>
</head>
<%@ page isELIgnored="false"%>
<body>
	<h1>Chi tiết khách hàng</h1>
	<a href="/CustomerManager/customers">Trở về trang chủ</a>
	<table>
		<tr>
			<td>Tên:</td>
			<td>${customer.getName()}</td>
		</tr>
		<tr>
			<td>Tuổi:</td>
			<td>${customer.getAge()}</td>
		</tr>
		<tr>
			<td>Địa chỉ:</td>
			<td>${customer.getAddress()}</td>
		</tr>
	</table>
</body>
</html>
