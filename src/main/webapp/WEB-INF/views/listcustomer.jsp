<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
					<h4>List Customer</h4>
				</div>
				<form action="<%=request.getContextPath()%>/searchCustomer">
					<div class="col-6 mt-3">
						<div class="input-group">
							<div class="seach">
								<i class="fa-solid fa-magnifying-glass form-control"> </i>
							</div>
							<input type="text" name="inputSearch" id="inputSearch" placeholder="" value="${inputSearch}"
								class="form-control">
							<div class="icon">
								<button type="submit" class="form-control"
									style="background-color: aqua;">Search</button>
							</div>

						</div>
					</div>
				</form>

				<table class="table table-stripped table-bordered mt-3">
					<thead>
						<tr>
							<th>Ma khach hang</th>
							<th>Ten khach hang</th>
							<th>Dia chi</th>
							<th>So dien thoai</th>
							<th>Email</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="customer" items="${listCustomer}">
							<tr>
								<td>${customer.maKH}</td>
								<td>${customer.tenKH}</td>
								<td>${customer.diaChi}</td>
								<td>${customer.soDienThoai}</td>
								<td>${customer.email}</td>
								<td><a
									href="${pageContext.request.contextPath}/customerEdit?id=${customer.maKH}"
									id=""> <i class="fa-regular fa-eye"></i> View
								</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>

		</div>
	</div>
</body>
</html>