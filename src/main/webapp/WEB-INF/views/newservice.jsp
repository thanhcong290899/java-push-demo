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
<title>Insert title here</title>
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
					<h4>Create new Service</h4>
				</div>

				<form:form modelAttribute="dichvu"
					action="${pageContext.request.contextPath}/addservice"
					method="post">
					<div class="form-group">
						<label for=""> Ma dich vu<span>(*)</span></label>
						<form:input path="maDV" type="text" id="" class="form-control" />
						<div class="d-error">
							<form:errors path="maDV" cssStyle="color:red">
							</form:errors>
						</div>
					</div>
					<div class="form-group">
						<label for=""> Ten dich vu<span>(*)</span></label>
						<form:input path="tenDV" type="text" id="" class="form-control" />
						<div class="d-error">
							<form:errors path="tenDV" cssStyle="color:red">
							</form:errors>
						</div>
					</div>
					<div class="form-group">
						<label for=""> Don vi tinh <span>(*)</span></label>
						<form:input type="text" path="donViTinh" id=""
							class="form-control" />
						<div class="d-error">
							<form:errors path="donViTinh" cssStyle="color:red">
							</form:errors>
						</div>
					</div>
					<div class="form-group">
						<label for=""> Don gia <span>(*)</span></label>
						<form:input type="text" path="donGia" id="" class="form-control" />
						<div class="d-error">
							<form:errors path="donGia" cssStyle="color:red">
							</form:errors>
						</div>
					</div>

					<div class="add">
						<button type="submit" class="btn btn-success">
							<i class="fa-solid fa-plus"></i> Add
						</button>
					</div>
				</form:form>


			</div>

		</div>
	</div>
</body>
</html>