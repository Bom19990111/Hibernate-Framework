<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Spring MVC 5 - form handling | Java Guides</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.6.0.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h2 class="text-center">Spring MVC 5 + Hibernate 5 + JSP + MySQL
				Example</h2>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add Student</div>
				</div>
				<div class="panel-body">
					<form:form action="saveStudent" cssClass="form-horizontal"
						method="post" modelAttribute="student">

						<!-- need to associate this data with customer id -->
						<form:hidden path="id" />

						<div class="form-group">
							<label for="fullName" class="col-md-3 control-label">Họ
								tên</label>
							<div class="col-md-9">
								<form:input path="fullName" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="age" class="col-md-3 control-label">Tuổi</label>
							<div class="col-md-9">
								<form:input type="number" path="age" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="address" class="col-md-3 control-label">Địa
								chỉ</label>
							<div class="col-md-9">
								<form:input path="address" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="class_name" class="col-md-3 control-label">Lớp</label>
							<div class="col-md-9">
								<form:input path="className" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>