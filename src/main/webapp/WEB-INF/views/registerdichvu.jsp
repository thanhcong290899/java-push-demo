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
					<h4>Đăng kí sử dụng dịch vụ</h4>
				</div>

				<form:form modelAttribute="SuDungDichVu"
					action="${pageContext.request.contextPath}/registerDichVu" method="post">
					<div class="form-group">
						<label for=""> Mã khách hàng<span>(*)</span></label>
						<form:select path="khach.maKH" items="${khachHangs}"
							itemLabel="label" itemValue="maKH" class="form-control">
						</form:select>
						
					</div>
					<div class="form-group">
						<label for=""> Mã dich vụ<span>(*)</span></label>
						<form:select path="dichvu.maDV" items="${dichVus}" itemLabel="maDV"
							itemValue="maDV" class="form-control">
						</form:select>
						
					</div>
					<div class="form-group">
						<label for=""> Ngày sử dụng dịch vụ<span>(*)</span></label>
						<form:input path="ngaySuDung" type="date" id=""
							class="form-control" />
						<form:errors path="ngaySuDung" cssStyle="color:red">
						</form:errors>
					</div>
					<div class="form-group">
						<label for=""> Giờ sử dụng <span>(*)</span></label>
						<form:input type="text" path="gioSuDung" id=""
							class="form-control" />
						
					</div>
					<div class="form-group">
						<label for=""> Số lượng <span>(*)</span></label>
						<form:input type="text" path="soLuong" id=""
							class="form-control" />
						<form:errors path="soLuong" cssStyle="color:red">
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