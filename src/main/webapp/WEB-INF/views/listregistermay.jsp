<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/fontawesome-free-6.4.2-web/fontawesome-free-6.4.2-web/css/all.min.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/bootstrap-4.0.0-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/header.css">
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
					<h4>List register Computer</h4>
				</div>
		<%-- 		<form action="<%=request.getContextPath()%>/searchMay" method="get">
					<div class="col-6 mt-3">
						<div class="input-group ip">
							<div class="seach">
								<i class="fa-solid fa-magnifying-glass form-control"> </i>
							</div>
							<input type="text" name="inputSearch" id="inputSearch"
								value="${inputSearch}" placeholder="" class="form-control">
							<div class="icon">
								<button type="submit" class="form-control"
									style="background-color: aqua;">Search</button>
							</div>

						</div>
					</div>
				</form> --%>

				<table class="table table-stripped table-bordered mt-3">
					<thead>
						<tr>
							<th>Mã khách hàng</th>
							<th>Mã máy</th>
							<th>Ngày bắt đầu sử dụng</th>
							<th>Giờ bắt đầu sử dụng</th>
							<th>Thời gian sử dụng</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="sdmay" items="${sdMay}">
							<tr>
								<td>${sdmay.khach.maKH}</td>
								<td>${sdmay.may.maMay}</td>
								<td>${sdmay.ngayBatDau}</td>
								<td>${sdmay.gioBatDau}</td>
								<td>${sdmay.thoiGianSuDung}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>

		</div>
	</div>
</body>
</html>