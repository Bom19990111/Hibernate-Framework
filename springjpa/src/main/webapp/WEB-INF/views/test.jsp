<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>javaguides.net</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous" />
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<body>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Customer Manager</h2>
			<hr />

			<input type="button" value="Thêm khách hàng"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br /> <br />
			<div class="panel panel-info">
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>ID</th>
							<th><a href="home?s=name">Họ tên</a></th>
							<th></th>
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempCustomer" items="${a.content}">
							<tr>
								<td>${tempCustomer.id}</td>
								<td>${tempCustomer.name}</td>
								<td>
									<!-- display the update link --> <a href="${updateLink}">Update</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</table>
					<nav aria-label="Page navigation example">
						<ul class="pagination">
							<c:if test="${a.number - 1 == 0}">
								<li class="page-item disable"><a class="page-link"
									href="home?p=${a.number - 1}">Previous</a></li>
							</c:if>
							<c:if test="${a.number - 1 > 0}">
								<li class="page-item"><a class="page-link"
									href="home?p=${a.number - 1}">Previous</a></li>
							</c:if>
							<li class="page-item"><a class="page-link"
								href="home?p=${a.number}">${a.number + 1}/${a.totalPages}</a></li>
							<c:if test="${a.number + 1 > a.totalPages}">
								<li class="page-item disable"><a class="page-link"
									href="home?p=${a.number + 1}">Next</a></li>
							</c:if>
							<c:if test="${a.number + 1 < a.totalPages}">
								<li class="page-item"><a class="page-link"
									href="home?p=${a.number + 1}">Next</a></li>
							</c:if>
						</ul>
					</nav>
					<li class="page-item">Tổng số sản phẩm : ${a.totalElements}
						sản phẩm</li>
				</div>
			</div>
		</div>
	</div>
</body>
</html>