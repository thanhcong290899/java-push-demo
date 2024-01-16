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
<link id="contextPathHolder"
	data-contextPath="${pageContext.request.contextPath}" />
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
					<h4>Edit service</h4>
				</div>

				<form:form modelAttribute="dichvu"
					action="${pageContext.request.contextPath}/updateservice"
					method="post">
					<form:input path="maDV" type="hidden" id="idservice"
						class="form-control" />
					<div class="form-group">
						<label for=""> Tên dịch vụ <span>(*)</span></label>
						<form:input path="tenDV" type="text" id="" class="form-control" />
					</div>
					<div class="form-group">
						<label for=""> Đơn vị tính <span>(*)</span></label>
						<form:input type="text" path="donViTinh" id=""
							class="form-control" />
					</div>
					<div class="form-group">
						<label for=""> Đơn giá <span>(*)</span></label>
						<form:input type="text" path="donGia" id="" class="form-control" />
					</div>


					<div class="foot">
						<div class="back">
							<button type="button" class="btn btn-info deleteservice">

								<i class="fa-solid fa-trash"></i> Delete
							</button>
						</div>
						<div class="add">
							<button type="submit" class="btn btn-success">
								<i class="fa-solid fa-plus"></i> Update
							</button>
						</div>
					</div>
					<div class="content">
						<div class="modal" tabindex="-1" role="dialog">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-body">
										<p>Ban chac chan muon xoa</p>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-primary delete">yes</button>
										<button type="button" class="btn btn-secondary nodelete"
											data-dismiss="modal">no</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</form:form>

			</div>

		</div>
	</div>
</body>
<script
	src="<%=request.getContextPath()%>/resources/jquery/jquery-3.7.1.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/delete.js"></script>
</html>