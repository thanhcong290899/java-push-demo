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
					<h4>Đăng kí sử dụng máy</h4>
				</div>

				<form:form modelAttribute="SuDungMay"
					action="${pageContext.request.contextPath}/createMay" method="post">
					<div class="form-group">
						<label for=""> Mã khách hàng<span>(*)</span></label>
						<form:select path="khach.maKH" items="${khachHangs}"
							itemLabel="label" itemValue="maKH" class="form-control">
						</form:select>
						
					</div>
					<div class="form-group">
						<label for=""> Mã máy<span>(*)</span></label>
						<form:select path="may.maMay" items="${mays}" itemLabel="maMay"
							itemValue="maMay" class="form-control">
						</form:select>
						
					</div>
					<div class="form-group">
						<label for=""> Ngày bắt đầu sử dụng<span>(*)</span></label>
						<form:input path="ngayBatDau" type="date" id=""
							class="form-control" />
						<form:errors path="ngayBatDau" cssStyle="color:red">
						</form:errors>
					</div>
					<div class="form-group">
						<label for=""> Giờ bắt đầu sử dụng <span>(*)</span></label>
						<form:input type="text" path="gioBatDau" id=""
							class="form-control" />
						
					</div>
					<div class="form-group">
						<label for=""> Thời gian sử dụng <span>(*)</span></label>
						<form:input type="text" path="thoiGianSuDung" id=""
							class="form-control" />
						<form:errors path="thoiGianSuDung" cssStyle="color:red">
						</form:errors>
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