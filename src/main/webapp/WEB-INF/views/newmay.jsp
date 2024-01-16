<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fontawesome-free-6.4.2-web/fontawesome-free-6.4.2-web/css/all.min.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/bootstrap-4.0.0-dist/css/bootstrap.min.css">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<c:import url="header.jsp"></c:import>
		</div>
		<div class="row">
			<c:import url="menu.jsp"></c:import>

			<div class="col-10">

				<div class="row">
					<h4>Create a new machine</h4>
				</div>

				<form:form modelAttribute="may" id="vitriform"
					action="${pageContext.request.contextPath}/addmay" method="post">
					<div class="form-group">
						<label for="maMay"> Ma May<span>(*)</span></label>
						<form:input path="maMay" type="text" id="maMay" class="form-control" />
						<%-- <div class="d-error">
							<form:errors path="maMay" cssStyle="color:red">
							</form:errors>
						</div> --%>
					</div>

					<div class="form-group ">
						<label for=viTri> Vi Tri<span>(*)</span></label>
						<form:input path="viTri" type="text" id="viTri"
							class="form-control" />
						<%-- 	<div class="d-error">
							<form:errors path="viTri" cssStyle="color:red">
							</form:errors>
						</div> --%>
					</div>
					<div class="form-group">
						<label for=""> Trang Thai <span>(*)</span></label>
						<form:input type="text" path="trangThai" id=""
							class="form-control" />
						<div class="d-error">
							<form:errors path="trangThai" cssStyle="color:red">
							</form:errors>
						</div>
					</div>
					<div class="add">
						<button type="submit" class="btn btn-success vldmay">
							<i class="fa-solid fa-plus"></i> Add
						</button>
					</div>
				</form:form>


			</div>

		</div>
	</div>
</body>
<script
	src="<%=request.getContextPath()%>/resources/jquery/jquery-3.7.1.min.js"></script>
<script
	src="<%=request.getContextPath()%>/resources/jquery/jquery.validate.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/validate.js"></script>
</html>