<%--
  Created by IntelliJ IDEA.
  User: nhat
  Date: 4/20/18
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>View product details</title>
</head>
<%@ page isELIgnored="false" %>
<body>
    <h1>Product details</h1>
    <a href="/products">Back to product list</a>
    <table>
        <tr>
            <td>Code: </td>
            <td>${product.getCode()}</td>
        </tr>
        <tr>
            <td>Name: </td>
            <td>${product.getName()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${product.getPrice()}</td>
        </tr>
    </table>
</body>
</html>
